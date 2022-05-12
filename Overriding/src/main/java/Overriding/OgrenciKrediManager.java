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
public class OgrenciKrediManager extends BaseKrediManager {

    public double hesapla(double tutar) {
        return tutar * 1.08;
    }
}
