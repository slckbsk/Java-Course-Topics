/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticdemo;

/**
 *
 * @author sb
 */
public class ProductManager {

    public void add(Product product) {
        
        ProductValidator productValidator = new ProductValidator();
        
        if (productValidator.isValid(product)) {
            System.out.println("Eklenmiş Ürün");
        } else {
            System.out.println("Eklenmemiş Ürün");
        }

 
//        if (ProductValidator.isValid(product)) {
//            System.out.println("Eklenmiş Ürün");
//        } else {
//            System.out.println("Eklenmemiş Ürün");
//        }
    }

}
