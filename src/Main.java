import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */
        System.out.println("Liczby od 100 do 0 podzielne przez 7: ");
        int index = 7;
        int i;

        for (i=100; i>0; i--){
            if (i%index == 0) System.out.print(i + ", ");
        }

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        System.out.println("\n");
        System.out.println("Podaj kolejne elementy 5-o elementowej tablicy oddzielone spacja: ");
        Scanner wpisz = new Scanner(System.in);

        int [] tabI = new int [5];

        tabI[0] = wpisz.nextInt();
        tabI[1] = wpisz.nextInt();
        tabI[2] = wpisz.nextInt();
        tabI[3] = wpisz.nextInt();
        tabI[4] = wpisz.nextInt();

        System.out.print("Elementy tablicy powiekszone o 11 to: " );
        for (int element : tabI) {
            System.out.print((element +11) + ", ");
        }
    }
}
