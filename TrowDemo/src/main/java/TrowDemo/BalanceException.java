/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrowDemo;

/**
 *
 * @author sb
 */
public class BalanceException extends Exception {

    String message;

    public BalanceException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
