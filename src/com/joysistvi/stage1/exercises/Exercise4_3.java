/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage1.exercises;

import java.math.BigDecimal;
import java.util.Scanner;


public class Exercise4_3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int startNumber = scanner.nextInt();
        System.out.print("Enter the common difference: ");
        int commonDiff = scanner.nextInt();
        System.out.print("Enter the number of terms (N): ");
        int N = scanner.nextInt();
        
        int currentNumber = startNumber;
        int sum = 0; // 17
        
        System.out.print("SUM: ");
        
        for (int i = 1; i <= N; i++) {
            System.out.print(currentNumber);
            
            sum += currentNumber; // sum = 0 + 1 + 6 + 11;                                                                                                                                                                        
            
            if (i < N) {
                System.out.print(" + ");
            } 
            
            currentNumber += commonDiff; // currentNumber = 1 + 5 + 5 = 11
        }
        
        System.out.println(" = " + sum);
        
        
        
        System.out.print("PRODUCT: ");
        long product = 1;
        currentNumber = startNumber;
        for (int i = 1; i <= N; i++) {
            System.out.print(currentNumber);
            product *= currentNumber;
            
            if (i < N) {
                System.out.print(" * ");
            }
            
            currentNumber += commonDiff;
        }
        
        System.out.println(" = " + product);
    }      
}
