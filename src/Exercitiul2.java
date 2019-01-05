// 2.scrieti un alt algoritm de sortare, preferabil pe care il ganditi voi. nu e important sa fie optim.
// citit despre insertion sort si il rescrieti pe hartie/cod

import java.util.Arrays;
import java.util.Scanner;

public class Exercitiul2 {
    public static void main(String[] args) {
        int min = 2500000;
        int var1 = 0;
        int i;

        System.out.println("Va rugam introduceti numarul de elemente ce trebuiesc sortate");
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
        System.out.println("sirul dumneavoastra arata asa  =  " + Arrays.toString(sir_numere));

        for (int b = 0; b <= sir_numere.length; b++) {
            if (sir_numere[b] < min) {
                var1 = sir_numere[b];
                sir_numere[b] = min;
                min = var1;
                sir_numere[b] = min;

            }

            System.out.println("sirul dumneavoastra arata asa  =  " + Arrays.toString(sir_numere));
        }


        System.out.println("Va multumim, exercitiul s-a incheiat cu succes, o zi buna in continuare");
    }

}
