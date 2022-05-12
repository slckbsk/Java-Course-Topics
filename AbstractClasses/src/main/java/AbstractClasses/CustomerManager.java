/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClasses;

/**
 *
 * @author sb
 */
public class CustomerManager {
    
    BaseDatabaseManager bdm;
            
    public void getCustomer(){
        bdm.getData();
    }
}
