package javaapp_02_otelemutomb;

import java.util.Scanner;

public class JavaApp_02_OtelemuTomb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tomb = new int[5];
        System.out.println("Kérjük adjon meg öt természetes számot.");
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = sc.nextInt();
        }
        System.out.print("A megadott számok:");
        for (int i : tomb) {
            System.out.print(" " + i);
        }
        System.out.print("\nFordított sorrendben:");
        for (int i = tomb.length-1; i >= 0; i--) {
            System.out.print(" " + tomb[i]);
        }
        System.out.println("\nMásodik elem: " + tomb[1]);
        int szam;
        do {
            System.out.println("Kérem adjon meg egy számot 1 és 5 között");
            szam = sc.nextInt();
            szam--;
        } while (szam<0 || szam>4);
        
        System.out.println(tomb[szam]);
    }
    
}
