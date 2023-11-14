package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Skapa en while loop för menu
        while (true) {
            System.out.println("Welcome to AMT");
            System.out.println("_________________________________");
            System.out.println("1: Insert card"); // Olika val
            System.out.println("2: Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose menu: ");  // Be användare att välja
            String menu = scanner.nextLine();
            if (menu.equals("1")) {         // if sat för komma åt menu
                Display display = new Display();
                display.menu();
                break;
            } else if (menu.equals("2")) {
                System.out.println("Goodbye!!!");
                break;
            } else {
                System.out.println("Please write in 1 or 2 to continues");
            }
        }
    }
}
