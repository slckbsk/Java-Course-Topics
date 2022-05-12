/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DegerVeRefaranslar;

/**
 *
 * @author sb
 */
public class Main {

    public static void main(String[] args) {

        //   DEĞER VE REFERANSALAR
        // new le oluşturulan referans tip
        MusterilerSinifi musterilerSinifi = new MusterilerSinifi();
        musterilerSinifi.MusteriDüzenle();
        musterilerSinifi.MusteriEkle();
        musterilerSinifi.MusteriSil();

        /* burda MusterilerSinifi sınıfı stakta oluşurken heapte musterilerSinifi oluşuyor
     biz ikinci bir MusterilerSinifi oluşturduğumuzda 2. bir musterilerSinifi heapte oluşuyor
     hepsi kendi değerini oluşturduğunu heapte tutuyor, biz ilk oluşan MusterilerSinifi 'nı
     2. MusterilerSinifi'na eşitlersek ilkinin tutuğu referans boşa düşer ve GC onu bellekten atar
         */
        // ÖRNEK
        MusterilerSinifi musterilerSinifi2 = new MusterilerSinifi();
        MusterilerSinifi musterilerSinifi1; // heapte değer tutmuyor
        musterilerSinifi1 = musterilerSinifi2; // musterilerSinifi1'i  musterilerSinifi2'nin referansına eşitledik 

        musterilerSinifi1.MusteriDüzenle();
        musterilerSinifi1.MusteriEkle();
        musterilerSinifi1.MusteriSil();
        System.out.println("------------\n");

        // double, int, float DEĞER TİPLERİDİR sadece stakta değerleri ile tutulur
        // örnek
        int sayi1 = 20;
        int sayi2 = 30;
        sayi1 = sayi2;
        sayi2 = 50;

        System.out.println(sayi1);
        System.out.println("------------\n");

        // Diziler ister string isterse int olsun REFERANS TİPLERDİR
        // örnek
        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{4, 5, 6};
        
        sayilar1 = sayilar2;
        
        sayilar2[0] = 10;
        System.out.println(sayilar1[0]);

    }

}
