package experiments.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<BankAccount> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<BankAccount>();
    }

    /**
     * This method is for a open an account.
     *
     * @param accountNumber;
     * @param accountHolderName;
     * @param accountbalance;
     */
    public void openAccount(String accountNumber, String accountHolderName, double accountbalance) {
        BankAccount account = new BankAccount(accountNumber, accountHolderName, accountbalance);
        this.accounts.add(account);
    }


    /**
     * This method is for a close an account.
     *
     * @param accountNumber;
     */
    public void closeAccount(String accountNumber) {
        for (int i = 0; i < this.accounts.size(); i++) {
            BankAccount account = this.accounts.get(i);
            if (account.getAccountNumber().equals(accountNumber)) {
                this.accounts.remove(i);
                break;
            }
        }
    }

    /**
     * This method take an account number and deposit method on the corresponding BankAccount object.
     *
     * @param accountNumber
     * @param amount
     */
    public void deposit(String accountNumber, double amount) {
        for (int i = 0; i < this.accounts.size(); i++) {
            BankAccount account = this.accounts.get(i);
            if (account.getAccountNumber().equals(accountNumber)) {
                account.depositingMoney(15000);
                break;
            }
        }
    }

    /**
     * This method take an account number and withdraw on the corresponding BankAccount object.
     *
     * @param accountNumber
     * @param amount
     */
    public void withdraw(String accountNumber, double amount) {
        for (int i = 0; i < this.accounts.size(); i++) {
            BankAccount account = this.accounts.get(i);
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdrawingMoney(7000);
                break;
            }
        }
    }

    /**
     * This method return the total balance as a double.
     */
    public double balance(String accountNumber) {
        double sum = 0.0;
        for (int i = 0; i < this.accounts.size(); i++) {
            BankAccount account = this.accounts.get(i);
            sum += account.checkingTheCurrentAccount();
        }
        return sum;
    }
}
