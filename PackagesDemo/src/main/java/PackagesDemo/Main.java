/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackagesDemo;

//import matematik.DaireCapi;
//import matematik.DortIslem;
import matematik. * ;
/**
 *
 * @author sb
 */
public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Adınızı girin");
//        String isim = scanner.nextLine();
//        System.out.println("Merhaba : " + isim);
        DortIslem dortIslem = new DortIslem();
        double toplam = dortIslem.topla(1.34, 5);
        System.out.println(toplam);

        DaireCapi daireCapi = new DaireCapi();
        double cap = daireCapi.DaireCapiHesapla(6);
        System.out.println(cap);
    }

}
