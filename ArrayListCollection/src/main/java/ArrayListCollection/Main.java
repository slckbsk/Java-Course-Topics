/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListCollection;

import java.util.ArrayList;

/**
 *
 * @author sb
 */
public class Main {

    public static void main(String[] args) {

//        // Dizi tekrar oluşturulduğunda ilk değerler yeni diziye atanmaz
//        int[] myDizi = new int[]{1, 2, 3};
//        myDizi = new int[4]; // bu yeni dizi oluşturdu üstekinin referansı YOK artık
//        myDizi[0] = 10;
//        myDizi[1] = 11;
//        myDizi[2] = 12;
//        myDizi[3] = 13;       
//        System.out.println(myDizi[0]);
        ArrayList sayilar = new ArrayList();
        sayilar.add(10);
        sayilar.add(12);
        sayilar.add("Ankara");
        sayilar.add(13);
        sayilar.add(14);
        sayilar.add("Samsun");

        System.out.println(sayilar.size());
        System.out.println(sayilar.get(2));

        sayilar.set(2, "Istanbul");
        System.out.println(sayilar.get(2));

        sayilar.remove(2);
        System.out.println(sayilar.get(2));

        //    sayilar.clear();
        
        
        System.out.println("----------------");
        for (Object object : sayilar) {
            System.out.println(object);
        }
    }

}
