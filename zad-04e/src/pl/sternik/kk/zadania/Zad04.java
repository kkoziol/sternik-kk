package pl.sternik.kk.zadania;

import java.util.Scanner;

public class Zad04 {

    public static void main(String[] args) {
        System.out.println("linia 1");
        System.out.println("lina 2");

        int[] ssss = {2,3,4,6,7,0};
        
        for (int i = 0; i < ssss.length; i++) {
            System.out.println(ssss[i]);
        }
        
        int i =0;
        while (i<ssss.length) {
            System.out.println(ssss[i]);
            i++;
        }
        i = 0;
        do {
            System.out.println(ssss[i]);
            i++;
        } while (i<ssss.length);
        
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        
    }

}
