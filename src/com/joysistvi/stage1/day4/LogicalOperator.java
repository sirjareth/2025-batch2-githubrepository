/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage1.day4;

/**
 *
 * @author Yuno
 */
public class LogicalOperator {
    
    public static void main(String[] args) {
        // Logical &&
        // Logical ||
        
        // return value: true and false
        int num = 10;
        int num2 = 20;
        //                 T              T            F
        System.out.println(num > num2 | num <= num2 | num != num2);
        
        /* Logical && -> Kapag may false, false na yung statement
            1st 2nd Result
            T   T   T
            T   F   F
            F   T   F
            F   F   F
        */

        /* Logical || -> Kapag may true, true na yung statement
            1st 2nd Result
            T   T   T
            T   F   T
            F   T   T
            F   F   F
        */
        
        
        
    }
}
