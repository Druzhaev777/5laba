package com.company;
import java.util.Random;




public class Main {
    public static void main(String[] args) {
        int[] a = new int[7];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }

        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int imin = i;



            for (int j = i + 1; j < a.length; j++) {

                if (a[j] < min) {
                    min = a[j];
                    imin = j;
                }
            }



            if (i != imin) {
                int temp = a[i];
                a[i] = a[imin];
                a[imin] = temp;
            }
            System.out.print(a[i] + " ");
        }
    }
}

