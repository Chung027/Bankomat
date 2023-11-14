package org.example;

import java.util.ArrayList;

public class BankAccount {


    private String accountName;
    private String accountNumber;
    public Double availableAmount;
    public BankAccount(String accountName, String accountNumber, Double availableAmount) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.availableAmount = availableAmount;
    }
    public BankAccount(){
    }

    public void printInfo(){
        System.out.println("Account:  " + getAccountName() + ". " +
                            "Account numbers: " + getAccountNumber() + ". " +
                            "Amount: " + getAvailableAmount());
    }
    public void printName(){
            System.out.println("Account:  " + getAccountName());
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Double getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(Double availableAmount) {
        this.availableAmount = availableAmount;
    }


}
