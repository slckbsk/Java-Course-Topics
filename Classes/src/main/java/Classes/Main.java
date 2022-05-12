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
public class Main {

    public static void main(String[] args) {

        //   DortIslem();  
        Product product = new Product();

        product.setId(108);
        product.setName("LapTop");
        product.setDescription("Lenovo");
        product.setPrice(5000.00);
        product.getUrunKodu();

        System.out.println(product.getUrunKodu());
        System.out.println("0 ----------------");

        Product product1 = new Product(108, "LapTop", "Lenovo", 5000.00, 3, "108L");
        System.out.println(product1.getUrunKodu());
        System.out.println("1----------------");

        
        Product product2 = new Product();
        System.out.println("2----------------");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }

    private static void DortIslem() {

        DortIslem dortislem = new DortIslem();
        int toplam = dortislem.Topla(4, 2);
        int carpma = dortislem.Carp(4, 2);
        int cikarma = dortislem.Cikar(8, 2);
        int bolme = dortislem.Bol(4, 2);

        System.out.println(toplam);
        System.out.println(carpma);
        System.out.println(cikarma);
        System.out.println(bolme);
    }

}
