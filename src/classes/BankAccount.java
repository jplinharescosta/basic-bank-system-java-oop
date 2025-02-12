package classes;

import java.util.Random;

public abstract class BankAccount {
    private int accountNumber;
    private double balance;
    private User user;

    Random radomNumber = new Random();

    public BankAccount(double balance, User user) {
        this.user = user;
        this.balance = balance;
        for (int i = 0; i < 5; i++) {
            this.accountNumber += radomNumber.nextInt(1, 100000);
        }        
    }

    public int getAccountNumber() {
        return accountNumber;
    }    

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        if (value > 0) {
            this.balance += value;
        }
    }

    public void withdraw(double value) {
        if (value > 0 && value <= this.balance) {
            this.balance -= value;
        }
    }

    public abstract void applyIncome();

    public abstract void getUserInfo();

    public void verifyBalance() {
        System.out.println("Saldo da conta " + this.accountNumber + ": R$" + this.balance);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }    
    
}
