package com.joysistvi.stage1.day11;

import java.util.Scanner;
public class StringClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure you want to delete your account?");
        System.out.println("[Y] [N]");
        
        if ("Y".equalsIgnoreCase(scanner.nextLine())) {
            System.out.println("Deleted Successfully!");
        } else {
        }
        
    }
}
