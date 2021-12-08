import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        Scanner wpisz = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int a = wpisz.nextInt();

        switch (a%2){
            case 0:
                System.out.println("liczba jest parzysta");
                break;
            default:
                System.out.println("liczba jest nie parzysta");
                break;
        }

        System.out.println();
        System.out.println("Podaj liczbe: ");

        int b = wpisz.nextInt();

        switch(b%7){
            case 0:
                System.out.println("Liczba jest podzielna przez 7 ");
                break;
            default :
                System.out.println(" liczba nie jest podzielna przez 7 ");
                break;
        }
        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        System.out.println();
        System.out.println("W strigu: \"ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo\": ");
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";

        int [] tab = new int [6];

        for (char literka : text.toCharArray()){

            switch (literka) {

                case 'o': ++tab[0];
                break;
                case 'p': ++tab[1];
                break;
                case 'x': ++tab[2];
                break;
                case 'z': ++tab[3];
                break;
                case 'q': ++tab[4];
                break;
                default: ++tab[5];
                break;
            }
        }

        System.out.println("Wystepuje: 'o' - " + tab[0] + " razy, 'p' - "+ tab[1] + " razy, 'x' - " + tab[2] + " razy, 'z' - " + tab[3] + " razy , 'q' - " + tab[4] + " razy.");
        System.out.println("Pozostałe litery wystepuja: " + tab[5] + " razy.");

    }
}
