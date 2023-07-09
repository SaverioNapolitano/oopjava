package com.snapolitano.exercises.oop.bankaccount;

public interface BankAccount2 {
    void addInterest();

    void deposit(double amount);

    double getBalance();

    String getIBAN();

    double getInterestRate();

    double getOperationFee();

    void setBalance(double balance);

    void setIBAN(String IBAN);

    void setInterestRate(double interestRate);

    void setOperationFee(double operationFee);

    double transfer(BankAccount2 other, double amount);

    double withdraw(double amount);

}