package com.backend.mastery.concepts.encapsulation;

import java.util.logging.Logger;
/**
 * Definition
 * Encapsulation means wrapping data (variables) and methods together into a single class while restricting direct access to data.
 */
class BankAccount {

    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationMain {

    static Logger logger = Logger.getLogger(EncapsulationMain.class.getName());
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        logger.info("Account balance after deposit = " + bankAccount.getBalance());
        bankAccount.withdraw(100);
        logger.info("Account balance after withdrawal = " + bankAccount.getBalance());

    }
}


