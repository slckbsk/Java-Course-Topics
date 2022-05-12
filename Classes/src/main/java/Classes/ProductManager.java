/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author sb
 */
public class ProductManager {

    public void Add(Product product) {
        System.out.println(product.getName() + " " + product.getDescription() + " Ürünü Eklendi");
    }

}
