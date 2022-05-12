/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadingDemo;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        KronometreThread kt1 = new KronometreThread("thread1");
        KronometreThread kt2 = new KronometreThread("thread2");
        KronometreThread kt3 = new KronometreThread("thread3");

        kt1.start();
        kt2.start();
        kt3.start();
    }

}
