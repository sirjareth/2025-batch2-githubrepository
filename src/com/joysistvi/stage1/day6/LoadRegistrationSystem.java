/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class LoadRegistrationSystem {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;
        do {
            System.out.println("Dial *143# to access Globe Service");
            System.out.print("Enter USSD Code: ");
            String ussdCode = scanner.nextLine();
            if (ussdCode.equals("*143#")) {
                mainMenu();
            } else {
                System.out.println("Invalid USSD Code.");
            }
        } while (running);

    }

    public static void mainMenu() {
        boolean running = true;
        do {

            System.out.println("\n\t*   Load Registration   *");
            System.out.println("[1] Go+");
            System.out.println("[2] SuperGo99");
            System.out.println("[3] GoEXTRA");
            System.out.println("[4] UNLI5G");
            System.out.println("[5] Go");
            System.out.println("[6] EXIT");
            System.out.print("Enter your choice:  ");

            try {
                int choice = getUserChoice();

                switch (choice) {
                    case 1:
                        goPlusPromo();
                        break;
                    case 2:
                        superGo99Promo();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        exitFunction();
                        break;
                    default:
                        System.out.println("Invalid Input!");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        } while (running);
    }

    public static void goPlusPromo() {
        System.out.println("\n\t* Go+ Promo *");
        System.out.println("[1] Go+99");
        System.out.println("[2] Go+129");
        System.out.println("[3] Go+149");
        System.out.println("[4] Back");
        System.out.println("[5] Exit");
        System.out.print("Enter your choice:");

        int goPromoChoice = getUserChoice();
        
        
        switch (goPromoChoice) {
            case 1:
                confirmation(20, "Go+99", 5);
                break;
            case 2:
                confirmation(40, "Go+129", 7);
                break;
            case 3:
                confirmation(60, "Go+149", 10);
                break;
            case 4:
                mainMenu();
                break;
            case 5:
                exitFunction();
                break;
            default:
                System.out.println("Invalid Input!");

        }
    }

    public static void superGo99Promo() {
        System.out.println("SuperGo99 Promo");
        System.out.println("[1] Super99");
        System.out.println("[2] Super129");
        System.out.println("[3] Super149");
        System.out.println("[4] Back");
        System.out.println("[5] Exit");
        System.out.print("Enter your choice: ");

        try {
            int superGoPromo = getUserChoice();
            
            
            switch (superGoPromo) {
                case 1:
                    confirmation(70, "Super99", 5);
                    break;
                case 2:
                    confirmation(100, "Super129", 7);
                    break;
                case 3:
                    confirmation(120, "Super149", 10);
                    break;
                case 4:
                    mainMenu();
                    break;
                case 5:
                    exitFunction();
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void confirmation(int gb, String promoType, int days) {
        System.out.println("\n\t * " + promoType + " *");
        System.out.println("Get " + gb + " GB total data!");
        System.out.println("[1] Subscribe");
        System.out.println("[2] Back");
        System.out.println("[3] Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        
        
        if (choice == 1) {
            System.out.println("You are now subscribed to " + promoType + ". Enjoy " + gb + " GB of data. Valid for " + days + " Day/s.");
            System.exit(0);
        } else if (choice == 2) {
            goPlusPromo();
        } else if (choice == 3) {
            exitFunction();
        }

    }

    public static void confirmation(String promoType, int gb) {
        System.out.println("\nGet " + gb + " GB total data!");
        System.out.println("[1] Subscribe");
        System.out.println("[2] Back");
        System.out.println("[3] Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        

        if (choice == 1) {
            System.out.println("You are now subscribed to " + promoType + ". Enjoy " + gb + " GB of data.");
            
        } else if (choice == 2) {
            // back
        } else if (choice == 3) {
            exitFunction();
        }

    }

    public static void exitFunction() {
        System.out.println("Are you sure you want to exit? \n[Y] Yes [N] No");
        System.out.print("Enter your choice: ");
        char exitChoice = scanner.nextLine().trim().toUpperCase().charAt(0);

        switch (exitChoice) {
            case 'Y':
                System.out.println("* Thank you *");
                System.exit(0);
                break;
            case 'N':
                System.out.println("Go Back to Main Menu");
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }
    
    public static int getUserChoice(){
        while(!scanner.hasNextInt()){
            System.out.println("Invalid Input! Please enter a number: ");
            scanner.nextLine();
            System.out.print("Enter your choice: ");
        }
        
        return scanner.nextInt();
    }
    
    

}
