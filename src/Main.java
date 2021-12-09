import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        //a)
        int a = 20;
        int i;

        System.out.println("Zatrzymaj na 3/4 iteracji:");

        for (i = a; i > 0; i--) {
            if (i == (a *0.75))
                break;
            System.out.print(i + " ");
        }
        //b)
        System.out.println();
        System.out.println("Liczby parzyste to: ");
        for(i=a;i>0;i--) {
        if (i % 2 != 0)
            continue;
        System.out.print(i + ", ");
        }
        //c)
        System.out.println();
        System.out.println("Zatrzymaj w polowie iteracji: ");
        for (i = a; i > 0 ; i--) {
            if (i == a/2 )
                return;
            System.out.print(i + " ");
        }





}


}
