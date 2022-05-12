/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MyList<String> sehirler = new MyList<>();
        sehirler.add("Istanbul");
        sehirler.add("Mersin");
        sehirler.add("Antalya");

        MyList<Customer> c_bilgileri = new MyList<>();
        c_bilgileri.add(new Customer());
        c_bilgileri.add(new Customer());
    }

}
