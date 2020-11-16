package com.laszlogulyas;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    VipCustomer() {
        this("default name", 0.00, "default email address");
    }

    VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default email address");
    }

    VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
