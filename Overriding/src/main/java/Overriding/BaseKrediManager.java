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
public class BaseKrediManager {

//         Final ile ezilmesini engelleyebiliriz
//         kimse yeni değer atayamaz
//    public final double hesapla(double tutar) {
//        return tutar * 1.18;
//    }

//         Final olmadığı için
//         ogrenci kredisi değerini değiştirdil overriding yaptık
    public double hesapla(double tutar) {
        return tutar * 1.18;
    }
}
