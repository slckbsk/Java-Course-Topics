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
public class KronometreThread implements Runnable {

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadNamex) {
        this.threadName = threadNamex;
        System.out.println(threadNamex + " Oluşturuluyor");
    }

    @Override
    public void run() {
        System.out.println(threadName + " Calışıyor ..");

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println(threadName + " : " + ex.getMessage());
        }

        System.out.println(threadName + " Bitti");

    }

    public void start() {
        System.out.println("Thread nesnesi oluşuyor");

        if (thread == null) {
            thread= new Thread(this, threadName);
            thread.start();
        } 
    }

}
