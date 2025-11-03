/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class LoadRegistration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // class instantiation
        System.out.println("Dial *143# to access Globe Service");
        System.out.print("Enter USSD Code: ");
        String ussdCode = scanner.nextLine();

        boolean running = true;
        do {
            if (ussdCode.equals("*143#")) {
                System.out.println("\n\n*************************");
                System.out.println("*   Load Registration   *");
                System.out.println("*************************");
                System.out.println("[1] Go+");
                System.out.println("[2] SuperGo99");
                System.out.println("[3] GoEXTRA");
                System.out.println("[4] UNLI5G");
                System.out.println("[5] Go");
                System.out.println("[6] EXIT");
                System.out.print("Enter your choice:  ");

                try {
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("");
                    switch (choice) {
                        case 1:
                            // outer if
                            System.out.println("* Go+ Promo *");
                            System.out.println("[1] Go+99");
                            System.out.println("[2] Go+129");
                            System.out.println("[3] Go+149");
                            System.out.print("Enter your choice:");
                            int goPromoChoice = scanner.nextInt();
                            if (goPromoChoice == 1) { // innner if
                                System.out.println("\nGet 20 GB total data!");
                                System.out.println("[1] Subscribe");
                                System.out.println("[2] Back");
                                System.out.println("[3] Exit");
                                System.out.print("Enter your choice: ");
                                goPromoChoice = scanner.nextInt();
                                
                                if (goPromoChoice == 1) {
                                    System.out.println("You are now subscribed to Go+99. Enjoy 20GB of data. Valid for 5 Days.");
                                } else if (goPromoChoice == 2) {
                                    // back
                                } else if (goPromoChoice == 3) {
                                    System.out.println("* Thank you! *");
                                } else {
                                    System.out.println("Invalid Input!");
                                }
                                
                            } else if (goPromoChoice == 2) {
                                System.out.println("\nGet 40 GB total data!");
                                System.out.println("[1] Subscribe");
                                System.out.println("[2] Back");
                                System.out.println("[3] Exit");
                                System.out.print("Enter your choice: ");
                                goPromoChoice = scanner.nextInt();
                                
                                if (goPromoChoice == 1) {
                                    System.out.println("You are now subscribed to Go+129. Enjoy 40GB of data. Valid for 7 Days.");
                                } else if (goPromoChoice == 2) {
                                    // back
                                } else if (goPromoChoice == 3) {
                                    System.out.println("* Thank you! *");
                                } else {
                                    System.out.println("Invalid Input!");
                                }
                                
                            } else if (goPromoChoice == 3) {
                                
                            }   break;
                        case 2:
                            System.out.println("SuperGo99 Promo");
                            System.out.println("[1] Super99");
                            System.out.println("[2] Super99129");
                            System.out.println("[3] Super99149");
                            System.out.print("Enter your choice: ");
                            int superGoPromo = scanner.nextInt();
                            switch (superGoPromo) {
                                case 1:
                                    System.out.println("\nGet 20 GB total data!");
                                    System.out.println("[1] Subscribe");
                                    System.out.println("[2] Back");
                                    System.out.println("[3] Exit");
                                    System.out.print("Enter  your choice: ");
                                    superGoPromo = scanner.nextInt();
                                case 2:
                                    
                            }   break;
                        case 3:
                            System.out.println("Enjoy GoEXTRA");
                            break;
                        case 4:
                            System.out.println("Enjoy UNLI 5G");
                            break;
                        case 5:
                            System.out.println("Enjoy Go Promo");
                            break;
                        case 6:
                            System.out.println("Are you sure you want to exit? \n[Y] Yes [N] No");
                            System.out.print("Enter your choice: ");
                            String exitChoice = scanner.nextLine();
                            switch (exitChoice) {
                                case "Y":
                                case "y":
                                    System.out.println("* Thank you *");
                                    running = false;
                                    break;
                                case "N":
                                case "n":
                                    System.out.println("Go Back to Main Menu");
                                    break;
                                default:
                                    System.out.println("Invalid Input!");
                            }   break;
                        default:
                            System.out.println("Invalid Input!");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Input. Please enter a valid number.");
                    scanner.nextLine();
                   
                }

            } else {
                System.out.println("Invalid USSD Code.");
            }

        } while (running);
        scanner.close();
    }
}
