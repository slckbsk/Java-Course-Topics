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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "LapTop";
        product.price = 7800;

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }

}
