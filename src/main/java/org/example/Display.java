package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Display {
    Scanner scanner = new Scanner(System.in);
    ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    BankAccount currentAccount;
    public Display(){
        BankAccount bankAccount1 = new BankAccount("Private","456 652",500.00d);
        bankAccounts.add(bankAccount1);
        bankAccounts.add(new BankAccount("Saving","962 365",15000.00d));
    }
    public void findAccount(){ // denna funktion jag använder for each loop för att går in alla lista account för
        boolean found = false;  // visa alla information om bank account. 
        while (!found) {
        System.out.println("Choose account");
        String input = scanner.nextLine();
            for (BankAccount account : bankAccounts) {
                if (account.getAccountName().equals(input)) {
                    account.printInfo();
                    found = true;
                    currentAccount = account;
                    break;
                }
            }
            if (!found){
                System.out.println("Please write in Private or Saving");
            }
        }
    }
    public void insertMoney(){
        int [] amounts = {50,100,200,500,1000};
        for( int amount : amounts) {
            System.out.println(amount);
        }
        try {
            System.out.println("Choose amount: ");
            int input = scanner.nextInt();
            scanner.nextLine();
            if (input == 50) {
                currentAccount.availableAmount += 50;
                System.out.println("You insert " + input + " into your bank account. " +
                        "Your account balance is " + currentAccount.availableAmount);
            }
            else if (input == 100) {
                currentAccount.availableAmount += 100;
                System.out.println("You insert " + input + " into your bank account. " +
                        "Your account balance is " + currentAccount.availableAmount);
            }
            else if (input == 200) {
                currentAccount.availableAmount += 200;
                System.out.println("You insert " + input + " into your bank account. " +
                        "Your account balance is " + currentAccount.availableAmount);
            }
            else if (input == 500) {
                currentAccount.availableAmount += 500;
                System.out.println("You insert " + input + " into your bank account. " +
                        "Your account balance is " + currentAccount.availableAmount);
            }
            else if (input == 1000) {
                currentAccount.availableAmount += 1000;
                System.out.println("You insert " + input + " into your bank account. " +
                        "Your account balance is " + currentAccount.availableAmount);
            }

            else {
                System.out.println("Please enter one of the numbers on the screen");
            }
        }
        catch (Exception e) {
            System.out.println("Please enter one of the numbers on the screen");
        }
    }
    private void withdrawMoney() {
            System.out.println("Enter amount");
            int amount = scanner.nextInt();
            scanner.nextLine();
            if (amount < currentAccount.availableAmount) {
                currentAccount.availableAmount -= amount;
                System.out.println("You withdrew " + amount + " from your bank account. " +
                        "Your account balance is " + currentAccount.availableAmount);
            }
            else {
                System.out.println("You bank account doesn't have sufficient amount");
            }
    }
    public void menu() {        // denna funktion är fortsätta med menu från main class
        int pincode = 3;
        while (true) {
            System.out.println("Enter your pincode");
            String password = scanner.nextLine();
            if (password.equals("1234")) {  // jag sätter if sat om användare skriva in rätt lösenord så kan komma åt menu
                System.out.println("Login successfully\n_________________________");
                for (BankAccount account: bankAccounts){
                    account.printName();
                }
                findAccount();
                menu2();
                break;
        }
            else {
                pincode --;         // om de skriver in fel kod så de har mindre försökt gång
                System.out.println("Wrong pincode. " + pincode + " tries more");
            }
             if (pincode == 0){
                System.out.println("Too many incorrect attempts. Exiting");
                break;
            }
        }
        System.out.println("Goodbye!!!");
    }

    public void menu2() {
        String[] menu2 = {"Insert money", "Withdraw money", "Exit"};
        boolean running = true;
        while (running) {
            for (int i = 0; i < menu2.length; i++){
                System.out.println((i+1) + ":" + menu2[i]);
            }
            System.out.print("\nChoose menu: ");
            String input = scanner.nextLine();
            switch(input){
                case "1":
                    insertMoney();
                    break;
                case "2":
                    withdrawMoney();
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    System.out.println("Please enter one of the numbers on the screen");
            }
        }
    }
}
