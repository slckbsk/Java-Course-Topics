/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverloading;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DortIslem dortislem = new DortIslem();

        int toplam = dortislem.Topla(2, 5);
        System.out.println(toplam);
//        yukarıdakı ve aşağda biri 2 parametreli diğeri 3 parametreli 
//        aynı isimdeki overload edilmiş method
        int toplam2 = dortislem.Topla(2, 5, 8);
        System.out.println(toplam2);

//        bunu öylesine denedim
        int toplam3 = dortislem.Toplax(2, 5, 8);
        System.out.println(toplam3);
    }

}
