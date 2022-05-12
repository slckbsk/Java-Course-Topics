/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dongular;

/**
 *
 * @author sb
 */
public class Main {

    // LOOPS
    public static void main(String[] args) {

        // FOR 
        // i++ ile i=1+1 aynıdır, i+=1
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("FOR bitti");

        // WHILE
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i = i + 2;
        }
        System.out.println("WHILE bitti");

        //DO-WHILE
        // şart uymazsada 1 kere calışacak
        int j = 20;
        do {
            System.out.println(j);
            j+=2;
        } while (j <= 10);
        System.out.println("DO-WHILE bitti");
    }

}
