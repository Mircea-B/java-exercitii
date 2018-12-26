// 2.scrieti un alt algoritm de sortare, preferabil pe care il ganditi voi. nu e important sa fie optim.
// citit despre insertion sort si il rescrieti pe hartie/cod

import java.util.Arrays;
import java.util.Scanner;

public class Exercitiul2 {
    // aici voi efectua exercitiul 2
    public static void main(String[] args) {
        int max;
        int min = 2500000;
        int var1 = 0;
        int i;

        System.out.println("Va rugam introduceti numarul de elemnte ce trebuiesc sortate");
        Scanner buff = new Scanner(System.in);
        i = buff.nextInt();

        int[] sir_numere = new int[i];
        System.out.println("================");
        System.out.println("Va rugam introduceti valorile ce trebuiesc sortate");

        for (int a = 0; a < sir_numere.length; a++) {
            System.out.print("sir_numere[" + a + "]= ");
            Scanner buff2 = new Scanner(System.in);
            int variabila = buff2.nextInt();
            sir_numere[a] = variabila;
        }
        for (int b = 0; b < sir_numere.length; b++) {
            if (sir_numere[b] < min) {
                sir_numere[b] = var1;
                min = var1;
                var1 = sir_numere[b + 1];
            }
            System.out.println(Arrays.toString(sir_numere));


        }
        System.out.println("Va multumim, exercitiul s-a incheiat cu succes, o zi buna in continuare");
    }
}
