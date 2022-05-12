/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsRepositoryDemo;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Customer customer = new Customer();
      Validator validator = new Validator();
      validator.validate(customer); // extend edilmiş ve generics metod
    }
    
}
