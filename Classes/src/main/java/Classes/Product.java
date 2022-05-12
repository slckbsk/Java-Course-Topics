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
public class Product {

    // Parametreli Yapıcı Constructor
    public Product(int id, String name, String description, Double price, int stockAmount, String urunKodu) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.urunKodu = urunKodu;

        System.out.println("Product NEW ile oluşturulduğunda çalışacak Parametreli");
    }

    // Overloading  // Parametresiz Yapıcı Constructor
    public Product() {
        System.out.println("Product NEW ile oluşturulduğunda çalışacak Parametresiz OVERLOADING");
    }

    // attribute and fields
    private int id;
    private String name;
    private String description;
    private Double price;
    private int stockAmount;
    private String urunKodu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getUrunKodu() {
        urunKodu = getId() + getName().substring(0, 1);
        return urunKodu;
    }

    
//    public void setUrunKodu(String urunKodu) {
//        this.urunKodu = urunKodu;
//    }
}
