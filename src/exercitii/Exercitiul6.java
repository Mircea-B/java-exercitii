package exercitii;

import java.util.*;

public class Exercitiul6 {

    public static void main(String[] args) {

        System.out.println("dati valori pentru array-uri");
        Scanner buffer = new Scanner(System.in);
        int nr_de_array1 = buffer.nextInt();
        int a = nr_de_array1;

        int array1[] = new int[a];

        System.out.println("dati valori pentru array-uri");
        Scanner buffer3 = new Scanner(System.in);
        int nr_de_array2 = buffer3.nextInt();
        int b = nr_de_array2;

        int array2[] = new int[b];

        int suma1 = 0;
        int suma2 = 0;

        for (int i = 0; i <array1.length ; i++) {
            System.out.println("array1[" + i + "]= ");
            Scanner buffer2=new Scanner(System.in);
            int z=buffer2.nextInt();
            array1[i]=z;

        }
        for (int y = 0; y <array2.length ; y++) {
            System.out.println("array2[" + y + "]= ");
            Scanner buffer4=new Scanner(System.in);
            int z=buffer4.nextInt();
            array2[y]=z;

        }

        for (int r = 0; r <array1.length ; r++) {
            suma1=suma1+array1[r];
        }
        for (int t = 0; t <array2.length ; t++) {
            suma2=suma2+array2[t];
        }


        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        if (suma1-suma2==0){
            System.out.println("ok");
        }else{
            System.out.println("nu e ok");
        }
    }


}
