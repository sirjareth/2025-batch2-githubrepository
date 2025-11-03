/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class SingleDimensionalArray {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] planets = new String[size];
        
        for (int i = 0; i < planets.length; i++) {
            System.out.print("Enter planet[" + i + "]: ");
            planets[i] = scanner.nextLine();
        }

        System.out.println("Displaying all the planets: ");
        for(String planet : planets){
            System.out.println(planet);
        }
        
    }
}

// {"Earth", "Mercury", "Venus", "Saturn", "Namek"}
/*
    //indices:        0   1    2   3   4
        int[] ages = {22, 23, 31, 19, 24};
        
        
        // Traversing an array using for loop
        //              i < 5
//        for (int i = 0; i < ages.length; i++) {
//            System.out.println(ages[1]);
//        }
       
        
        
 */


// Default Value:
/*
    Strinbg -> null
    integer -> 0
    floating point -> 0.0
    boolean -> false
*/