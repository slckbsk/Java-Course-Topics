/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        String ogrenci = "Hüseyin";
        String ogrenci1 = "Ömer";
        String ogrenci2 = "Hasan";
        String ogrenci3 = "Hüseyin_küçük";

        String[] ogrenciler = new String[4];
        ogrenciler[0] = ogrenci;
        ogrenciler[1] = ogrenci1;
        ogrenciler[2] = ogrenci2;
        ogrenciler[3] = ogrenci3;

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------------------");

        for (String ogrenciler1 : ogrenciler) {
            System.out.println(ogrenciler1);
        }
        System.out.println("------------------");
      
        
        // DEMO
        
       int [] myList = {1, 12, 2,3,4,5,6,7,8,9,10};
       int sonuc = 0;
       int enBuyuk = myList [0];
       
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
            sonuc = myList[i] + sonuc;
            
            if (enBuyuk < myList[i] ){
                enBuyuk = myList[i]; 
            }
        }
        
        System.out.println("toplam = " + sonuc);
        System.out.println("en büyüğü = " + enBuyuk);
        System.out.println("------------------");
        
        
       double [] myList1 = {1, 12, 2,3,4,5,6,7,8,9,10};
       double sonuc1 = 0;
       double enBuyuk1 = myList [0];
       
       for (double sayi : myList1) {
            System.out.println(sayi);
            sonuc1 = sayi + sonuc1;
            
            if (enBuyuk1 < sayi){
                enBuyuk1 = sayi; 
            }
        }

        System.out.println("toplam = " + sonuc1);
        System.out.println("en büyüğü = " + enBuyuk1);
        System.out.println("------------------");
        
         */
        
        
        String[] bolgeler = new String[3];
        bolgeler[0] = "MARMARA";
        bolgeler[1] = "İÇ ANADOLU";
        bolgeler[2] = "GÜNEY DOĞU ANADOLU";

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Urfa";
        sehirler[2][2] = "Antep";

        for (int i = 0; i < 3; i++) {
            System.out.println("\n");
            System.out.println((i+1)+ " " +bolgeler[i]);

            for (int j = 0; j < 3; j++) {
                System.out.println(sehirler[i][j]);
            }

        }

    }

}
