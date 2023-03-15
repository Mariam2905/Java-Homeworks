package org.example.experiments.bank;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Money depositing method.
     */
    public void depositingMoney(int deposit) {
        try {
            if (deposit < 0) {
                throw new IllegalArgumentException("You cannot add a negative amount.");
            }
            System.out.println("You are added " + deposit + " money.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        accountBalance += deposit;
        System.out.println("Your account balance after depositing is: " + accountBalance);
    }

    /**
     * Money withdrawal method.
     * Withdraw only if total money greater than or equal to the money requested for withdrawal
     */
    public void withdrawingMoney(int withdrawn) {
        try {
            if (withdrawn > accountBalance) {
                throw new IllegalArgumentException("Your account balance is insufficient․");
            } else {
                accountBalance -= withdrawn;
                System.out.println("Your balance after withdraw is: " + accountBalance);}
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public double checkingTheCurrentAccount() {
        System.out.println(accountBalance);
        return accountBalance;
    }
}


