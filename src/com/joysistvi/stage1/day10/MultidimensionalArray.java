/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage1.day10;

import java.util.Scanner;
public class MultidimensionalArray {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] planets = new String[2][3];
        
        for (int i = 0; i < planets.length; i++) {
            for (int j = 0; j < planets[i].length; j++) {
                System.out.print("Enter planet[" + i + "][" + j + "]: ");
                planets[i][j] = scanner.nextLine();
            }
        }
        
        
//        for (int i = 0; i < planets.length; i++) {
//            for (int j = 0; j < planets[i].length; j++) {
//                System.out.println(planets[i][j]);
//            }
//        }
        
        System.out.println("Displaying all the planets");
        for(String[] rows : planets){
            for(String column : rows){
                System.out.println(column);
            }
        }
        
        
        
    }
}


//        int[][] numbers = { 
//           //0 1 2 3 4 
//            {2,4,6,8,10}, // 0
//            {1,3,5,7,9}, // 1
//            {1,2,3} // 2
//        };
//        
//        // Nested For Each Loop
//        for(int[] rows : numbers){
//            for(int column : rows){
//                System.out.println(column);
//            }
//            System.out.println("");
//        }
        
        
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.println(numbers[i][j]);
//            }
//            System.out.println(""); // new line
//        }