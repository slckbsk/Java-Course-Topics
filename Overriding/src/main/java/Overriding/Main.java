/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        OgretmenKrediManager okm = new OgretmenKrediManager();
//        double miktar = okm.hesapla(1000);
//        System.out.println(miktar);

        BaseKrediManager[] bkms = new BaseKrediManager[]{
            new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager bkm : bkms) {
            double miktar = bkm.hesapla(1000);
            System.out.println(miktar);
        }

    }

}
