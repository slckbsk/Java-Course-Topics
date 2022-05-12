/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismDemo;

/**
 *
 * @author sb
 */
public class CustomerManager {

    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add() {
        System.out.println("Müşteri Eklendi");
        this.baseLogger.log("Log mesajı");
    }
}
