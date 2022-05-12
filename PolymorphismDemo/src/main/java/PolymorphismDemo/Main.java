/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismDemo;

/**
 *
 * @author sb
 */
public class Main {

//    ÇOK BİCİMLİLİK
//    Refarans tiplerin bir birinin refaransını tutması ile olan durum
//    aralarında Inheritance olan sınıflar birbirinin refaransını tutabilir
    public static void main(String[] args) {
//        EmailLogger emailLogger = new EmailLogger();
//        emailLogger.log("Hatalı email");

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }

}
