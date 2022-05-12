/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMapDemo;

import java.util.HashMap;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // DİKKAT <String, int> her türlü olur 
        HashMap<String, String> sozluk = new HashMap<String, String>();

        sozluk.put("Book", "Kitap");
        sozluk.put("Silly", "Aptal");
        sozluk.put("Calculator", "Hesap Makinesı");
        sozluk.put("Key", "Anahtar");

        System.out.println(sozluk.size());
        System.out.println(sozluk.get("Key"));
        System.out.println("---------");

        for (String s : sozluk.keySet()) {
            //  System.out.println(s);
            System.out.println("en - " + s + " / " + "tr - " + sozluk.get(s));
        }

//        sozluk.remove("Key");
//
//        System.out.println(sozluk.size());
//        System.out.println(sozluk.get("Key"));
//        
//        sozluk.clear();
//        
//        System.out.println(sozluk.size());
//        System.out.println(sozluk.get("Key"));;
    }

}
