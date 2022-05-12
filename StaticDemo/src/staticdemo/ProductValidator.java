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
public class ProductValidator {  // javada ana class STATİC olmaz, C# olur

    public  ProductValidator () {
        System.out.println("Yapıcı Calışacakmı?");  
    }
    
//    new ile oluşturulusa calışır, 
//    static cağırmada calışmaz
//    C# ta her türlü calışır
    
        static {
        System.out.println("Static Blok Calışacakmı?");  
    }
        
//    new ile oluşturulusa calışır, 
//    static cağırmada calışır

        
        // Inner class 
        public static class ValidatorProduct { // javada ana class STATİC olmaz, içinde static başka class olur
                   public static void sil() {  // static clasta static method
        } 
        }    
        
        
    public static boolean isValid(Product product) {

        if (product.price > 0 && !product.name.isEmpty()) {
            return true;

        } else {
            return false;
        }

    }

}
