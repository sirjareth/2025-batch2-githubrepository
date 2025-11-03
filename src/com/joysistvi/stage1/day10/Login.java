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
public class Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username = "user";
        String password = "user123";
        System.out.println("* Login *");
        boolean running = true;
        do {
            System.out.println("Enter username: ");
            String loginUsername = scanner.nextLine();

            System.out.println("Enter password: ");
            String loginPassword = scanner.nextLine();

            if (username.equals(loginUsername) && password.equals(loginPassword)) {
                System.out.println("Logged In Successfully!");
                running = false;
            } else {
                System.out.println("Invalid Credential.\n");
            }
        } while (running);

    }

}
