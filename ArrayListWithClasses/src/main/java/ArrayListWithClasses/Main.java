/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListWithClasses;

import java.util.ArrayList;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Customer> customer = new ArrayList<>();

        Customer ilk = new Customer(0, "Selçuk", "Başak");
        Customer ikinci = new Customer(1, "Hüseyin", "Başak");

        customer.add(ilk);
        customer.add(ikinci);
        customer.add(new Customer(2, "Ömer", "Başak"));
     
        customer.remove(0);
        
        for (int i = 0; i < customer.size(); i++) {
            System.out.println(customer.get(i).id +" "+ customer.get(i).firstName +" "+ customer.get(i).lastName);
        }
    }

}
