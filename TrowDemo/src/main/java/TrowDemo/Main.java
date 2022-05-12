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
public class Main {

    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();

        System.out.println(accountManager.getBalance());

        accountManager.deposit(500);
        System.out.println(accountManager.getBalance());

        try {
            accountManager.withdrow(200);
        } catch (BalanceException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(accountManager.getBalance());

        try {
            accountManager.withdrow(400);
        } catch (BalanceException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(accountManager.getBalance());
    }

}
