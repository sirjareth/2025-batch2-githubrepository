/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage1.exercises;

import java.util.Scanner;

public class Exercise3_Dadulla {
    /*
Age: 0 - 2 Category: Baby
Age: 3 - 12 Category: Child
Age: 13 - 19 Category: Teenager
Age: 20 - 29 Category: Young Adult
Age: 30 - 59 Category: Adult
Age: 60 - 100 Category: Senior
            // 60 - 70 -> Not yet eligible to pension
            // 70 - 100  -> Eligible to pension
    */
    // Validation (0-100)
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("*   Age Categorizer Program  *");
        System.out.println("==============================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); //10
        String ageBracket = "";
        
        if(age >= 0 && age <= 100){ // Validation
            if (age <= 2) { // 0 - 2
                ageBracket = "Baby";
            } else if (age <= 12) { // 3 - 12
                ageBracket = "Child";
            } else if (age <= 19) { // 13 - 19
                ageBracket = "Teenager";
            } else if (age <= 29) {
                ageBracket = "Young Adult";
            } else if (age <= 59) {
                ageBracket = "Adult";
            } else if (age <= 100) { // 
                ageBracket = "Senior";
            } else {
                System.out.println("There is no such thing as a negative age");
            }
            
            System.out.println("Age: " + age + " Category: " + ageBracket);
        } else {
            System.out.println("Invalid Age Input! Age must be greater than 0.");
        }

        
        
    }
}



/*
    
  

        
*/