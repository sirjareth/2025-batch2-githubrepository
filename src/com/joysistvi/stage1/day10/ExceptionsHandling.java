/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage1.day10;

import java.util.Scanner;

/**
 *
 * @author Yuno
 */
public class ExceptionsHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        } catch (Exception e) {
            System.out.println("Exception: " + e + " \nInvalid Input. Please enter a number.");
        }

        System.out.println("Hello");
    }
}
