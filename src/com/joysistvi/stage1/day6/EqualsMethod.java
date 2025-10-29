/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage1.day6;

import java.util.Scanner;

/**
 *
 * @author Yuno
 */
public class EqualsMethod {
    
    public static void main(String[] args) {
        /*
            Monday -> First day of the week
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        String day = scanner.nextLine();
        
        if ("Monday".equals(day)) {
            System.out.println("First day of the week");
        } else if(day.equals("Tuesday")){
            System.out.println("Second day of the week");
        } else if(day == "Wednesday"){
            System.out.println("Third day of the week");
        } else {
            System.out.println("Invalid Input!");
        }
        
        // == vs equals()
        
    }
}
