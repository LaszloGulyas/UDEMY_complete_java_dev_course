package com.laszlogulyas;

public class Main {

    public static void main(String[] args) {

        BankAccount localCustomer = new BankAccount();
            localCustomer.setAccountNumber("1000001957-12300987");
            localCustomer.setBalance(200.00);
            localCustomer.setCustomerName("Adam Smith");
            localCustomer.setCustomerEmail("adamsmith@yahoo.com");
            localCustomer.setCustomerPhone("+109-400-419-234");


        //Customer master data
        System.out.println("Master data of localCustomer");
        System.out.println("Account number: " + localCustomer.getAccountNumber());
        System.out.println("Customer name: " + localCustomer.getCustomerName());
        System.out.println("E-mail address: " + localCustomer.getCustomerEmail());
        System.out.println("Phone number: " + localCustomer.getCustomerPhone());
        System.out.println("Current balance: " + localCustomer.getBalance());
        System.out.println();

        //Transactions
        System.out.println("List of transactions: ");
        localCustomer.deposit(50.00);
        localCustomer.withdraw(19.99);
        localCustomer.deposit(200.00);

        //VIP customer class test
        VipCustomer johnSmith = new VipCustomer("John Smith", 50.00, "js@gmail.com");
        System.out.println("VIP customer name: " + johnSmith.getName());
        System.out.println("VIP customer credit limit: " + johnSmith.getCreditLimit());
        System.out.println("VIP customer email: " + johnSmith.getEmail());
    }
}
