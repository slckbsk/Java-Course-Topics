/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceDemo;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        OgretmenKredisiMudurlugu okm = new OgretmenKredisiMudurlugu();
        TarimKredisiMudurlugu tkm = new TarimKredisiMudurlugu();
        okm.Hesapla();  // BU KULLANIM KLASİK CAĞIRMA

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(okm);  // yukarıda oluşturulanı cağırdık 

//        Önemli kısım burası krediUI extend oldu BaseKrediMüdürlüğünden 
//        BaseKrediMudurlugu hem oğretmen, hem tarım için Anhne olduğundan 
//        hangisini cağırsak CALIŞACAK
        krediUI.KrediHesapla(new OgretmenKredisiMudurlugu());
        krediUI.KrediHesapla(new TarimKredisiMudurlugu());
        krediUI.KrediHesapla(new AskerKredisiMudurlugu());
    }

}
