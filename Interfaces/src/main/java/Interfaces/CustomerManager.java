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
public class CustomerManager {
    
    // İŞ KODLARI
    
    private  ICustomerDal customerDal; // private  yaptık 1.kullanım için public bırakabilirdik
    
    public CustomerManager (ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    
    public  void add(){
        customerDal.Add();
    }
    
}
