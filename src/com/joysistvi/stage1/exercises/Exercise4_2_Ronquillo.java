/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage1.exercises;


public class Exercise4_2_Ronquillo {
    public static void main(String[] args) {
        int N = 5; 
        int product = 1;

        for (int i = 1; i <= N; i++) {
            product *= i; // product = 1 * 1;
            System.out.println("i = " + i + ", product = " + product);
        }

        System.out.println("Final Product: " + product);
        
    }
}
