import com.sun.source.tree.Tree;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
        List<String> animals = new ArrayList<>();

        Scanner wpisz = new Scanner(System.in);

        System.out.println("Wpisz 5 zwiarząt(przedziel spacja): ");

        int i = 5;

        while (i > 0) {
            animals.add(wpisz.next());
            --i;
        }

        wypisuje(animals);

        animals.remove(4);
        animals.remove(3);
        animals.add("lew");
        animals.add("tygrys");
        animals.add("wilk");

        System.out.println();
        System.out.println(animals + " liczba elementow listy: " + animals.size());

        System.out.println();

        animals.sort(Collections.reverseOrder());
        wypisuje(animals);

        System.out.println();

         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        System.out.println("Podaj 10 liczb: ");

        Set<Integer> liczby = new TreeSet<>();

        i=10;
        while (i > 0) {
            liczby.add(wpisz.nextInt());
            --i;
        }

        System.out.println(liczby);
        System.out.println("Zawartoś seta to: ");
        for (int a : liczby){
            System.out.print(a + ", ");
        }
    }


    public static void wypisuje(List<String> listname) {

        for (String zmienna : listname){

            System.out.print(zmienna + ", ");
        }
    }
}


