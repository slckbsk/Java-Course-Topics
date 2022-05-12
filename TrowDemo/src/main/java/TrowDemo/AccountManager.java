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
public class AccountManager {

    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

//    public void withdrow(double amount) {
//        if (getBalance() >= amount) {
//            balance = getBalance() - amount;
//        } else {
//            System.out.println("Yetersiz Bakiye");
//        }
//    }
//        public void withdrow(double amount) throws Exception {
//        if (getBalance() >= amount) {
//            balance = getBalance() - amount;
//        } else {
//            throw  new Exception ("Yetersiz Bakiye");
//        }
//    }
    public void withdrow(double amount) throws BalanceException {
        if (getBalance() >= amount) {
            balance = getBalance() - amount;
        } else {
            throw new BalanceException("Yetersiz Bakiye");
        }
    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
}
