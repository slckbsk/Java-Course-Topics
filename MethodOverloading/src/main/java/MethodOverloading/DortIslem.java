/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverloading;

/**
 *
 * @author sb
 */
public class DortIslem {

    public int Topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
//   iki method da "Topla" biri 2 parametreli diğeri 3 ama isim aynı 
//    buna Overloading deniyor

    public int Topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

    //Bunu ben ekledim öylesine
    public int Toplax(int... sayi) {
        return sayi[0] + sayi[1] + sayi[2];
    }

    public int Cikar(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    public int Carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public int Bol(int sayi1, int sayi2) {
        return sayi1 / sayi2;
    }
}
