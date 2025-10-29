/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage1.exercises;


public class Exercise4_1_Ronquillo {
    public static void main(String[] args) {
        int N = 5; 
        int sum = 0;
        //              3 <= 5
        for (int i = 1; i <= N; i++) {
            sum += i; // sum = 0 + 0;
            System.out.println("i = " + i + ", sum = " + sum);
        }

        System.out.println("Final Sum: " + sum);
        
        
        
    }
}
