/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExeptionHandling;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean hataVar = false;

        try {

            int[] sayilar = new int[]{1, 2, 3, 4, 5};
            System.out.println(sayilar[3]);
            hataVar = false;

//            ArrayIndexOutOfBoundsException
//            StringIndexOutOfBoundsException 
//            IndexOutOfBoundsException
//            Exception -> Finilizer
                        
        } catch (Exception e) {
            System.out.println(e.getMessage());
            hataVar = true;



        } finally {
            if (hataVar) {
                System.out.println("Hata Var");
            } else {
                System.out.println("Hata Yok");
            }

        }
    }
}
