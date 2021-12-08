public class Main {

    public static void main(String[] args ) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        System.out.println("Moj nr indexu to 20407 - niestety podzielnik bedzie jedno-cyfrowy;)");

        int dzielnik = 7;
        int i = 1000;

        do {
            if(i%7==0){
                System.out.println("Liczba: " + i + " jest podzielna przez: " + dzielnik);
            }
        }while (--i>0);


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        System.out.println("\n");
        System.out.println("Przyklad a): ");

        int [] tabI = new int[5];

        tabI [0] = 10;
        tabI [1] = 81;
        tabI [2] = 9;
        tabI [3] = 19;
        tabI [4] = 3;

        int n=0;

        while (n< tabI.length){
            System.out.print(tabI[n] + ", ");
            ++n;
        }

        System.out.println();
        System.out.println("Przyklad b): ");

        double [] tabD = new double[5];

        tabD [0] = 22.5;
        tabD [1] = 49.93;
        tabD [2] = 96.12;
        tabD [3] = 759.394;
        tabD [4] = 3987.27517;

        int d=0;

        while (d< tabI.length){
            System.out.print(tabD[d] + ", ");
            ++d;
        }

        System.out.println();
        System.out.println("Przykład c): ");

        String [] tabS = new String[5];

        tabS [0] = "Alfons";
        tabS [1] = "Ildefons";
        tabS [2] = "Protazy";
        tabS [3] = "Bazyli";
        tabS [4] = "Pafnucy";

        int s = tabS.length - 1;

        while (s >=0){
            System.out.print(tabS[s] + ", ");
            --s;
        }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        System.out.println("\n");
        System.out.println("Przypadek gdy while(true):  sprawi, że powstanie infinite loop");
        System.out.println("Probowalem naprawić ten kod i niby udało się wypisać elementy tablicy, ale poajwial się komunikat, którego nie udało mi się pozbyć: ");
        System.out.println(" Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 20\n" +
                "\tat Main.main(Main.java:105)");
        /*
       int [] tabT = new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int m = tabT.length;
        if (m > 0 || m < 20)--m;



             while (true)
             {

               if (tabT[m] > 0){System.out.print(tabT[m] + ", "); --m;}

               else break;

             }

         */

        System.out.println("\n");
       System.out.println("Przypadek gdy while(false): pojawi się komunikat 'Unreachable statement' ");

        /*
        int [] tabT = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int m = tabT.length;
        --m;


        while (false)
        {

            System.out.println(tabT[m] + ", ");
        }
         */










    }
}
