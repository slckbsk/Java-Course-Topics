/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        CustomerManager cm = new CustomerManager(); // 1. kullanım
//        cm.customerDal = new OracleCustomerDal(); // burası önemli ama deseni CustomerManagerde değiştirdik
//        cm.add();

        CustomerManager cm = new CustomerManager(new OracleCustomerDal());
        cm.add();
    }

}
