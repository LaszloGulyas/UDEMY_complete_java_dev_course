package com.laszlogulyas;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("Successful deposit! New balance is: " + this.balance);
    }

    public void withdraw(double withdraw) {
        if(withdraw > this.balance) {
            System.out.println("Insufficient funds!");
        } else {
            this.balance -= withdraw;
            System.out.println("Successful withdrawal! New balance is: " + this.balance);
        }
    }
}
