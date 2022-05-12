/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodlar;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(toplama(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 300));
        System.out.println(toplama1(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,100, 300));
    }

    public static int toplama(int... sayilar) {

        int toplam = 0;
  
        for (int i = 0;  i <= sayilar.length;  i++) {
            toplam = toplam +  i;
        //    toplam += i;
        }
        return toplam;
    }
    
    
        public static int toplama1 (int... sayilar) {

        int toplam = 0;
        for (int sayi: sayilar) {
         //   toplam = toplam + sayi;
            toplam += sayi;
        }
        return toplam;
    }

}
