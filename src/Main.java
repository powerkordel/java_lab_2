import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */


        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        int [] tab = metoda1(20);
        metoda2(tab);
        System.out.println();

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */
        System.out.println("Podaj 6 wyrazow przedzielonych spacja: ");
        String [] tab2 = metoda3(6);
        metoda4(tab2);
        System.out.println();
        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        metoda5("Pawel");
        metoda5("Pawel","Kordel");
        metoda5("Pawel", "Kordel", 40);
        System.out.println();

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

        int zmienna1 = metoda6(3,6);
        int zmienna2 = metoda6(4,8,9);
        System.out.println("Suma obu metod wynosi: " + (zmienna1 + zmienna2));
    }

    public static int [] metoda1(int rozmiar){

        int [] tab0 = new int [rozmiar];
        for (int i=0; i<rozmiar; i++){
            tab0[i]=40-i;
        }
        return tab0;
    }

    public static void metoda2 (int [] tab){
        for (int i : tab){
            System.out.print(i + ", ");
        }
    }

    public static String[] metoda3(int wielkosc) {
        Scanner wpisz = new Scanner(System.in);
        String[] tabs = new String[wielkosc];
        for (int i = 0; i <= wielkosc-1; i++) {
            tabs[i] = wpisz.next();
        }
        return tabs;
    }

    public static void metoda4(String[]tab){
        for (int i = 5; i>=0; i--){
            System.out.print(tab[i] + ", ");
        }
    }

    public static void metoda5(String imie) {
        System.out.println(imie);
    }

    public static void metoda5(String imie, String nazwisko){
        System.out.println(imie + " " + nazwisko);
    }

    public static void metoda5(String imie, String nazwisko, int wiek){
        System.out.println(imie + " " + nazwisko + " : " + wiek);
    }

    public static int metoda6(int a, int b){
        return a+b;
    }

    public static int metoda6(int a, int b, int c){
        return a+b+c;
    }

}
