/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListTypeDemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Integer ----------------");
        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(47);
        sayilar.add(10);
        sayilar.add(11);
        sayilar.add(55);
        sayilar.add(12);
        sayilar.add(23);
        sayilar.add(13);
        sayilar.add(14);

        System.out.println(sayilar.size());
        System.out.println("----------------");

        System.out.println(sayilar.get(2));
        System.out.println("----------------");

        sayilar.set(2, 21);
        System.out.println(sayilar.get(2));
        System.out.println("----------------");

        sayilar.remove(2);
        System.out.println(sayilar.get(2));
        System.out.println("----------------");

        Collections.sort(sayilar);  // kücükten büyüğe 
        
        for (Object object : sayilar) {
            System.out.println(object);
        }

        System.out.println("----------------");
        sayilar.clear();
        System.out.println(sayilar.size());

        System.out.println("STRING ----------------");
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Konya");
        sehirler.add("Adana");
        sehirler.add("Ankara");
        sehirler.add("Urfa");
        sehirler.add("Mardin");
        sehirler.add("Samsun");

        System.out.println(sehirler.size());
        System.out.println("----------------");

        System.out.println(sehirler.get(2));
        System.out.println("----------------");

        sehirler.set(2, "Van");

        System.out.println(sehirler.get(2));
        System.out.println("----------------");

        sehirler.remove(2);
        System.out.println(sehirler.get(2));
        System.out.println("----------------");
        
        Collections.sort(sehirler);  // Alfabetik sıralama 

        for (int i = 0; i < sehirler.size(); i++) {
            System.out.println(sehirler.get(i).toString());
        }

        System.out.println("----------------");
        sehirler.clear();
        System.out.println(sehirler.size());

    }

}
