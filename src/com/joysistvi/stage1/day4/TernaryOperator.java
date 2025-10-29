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
public class TernaryOperator {

    public static void main(String[] args) {
        // syntax
        
        // condition ? true block : false block;
        //System.out.println("Program that will identify if the number is positive or negative");    
        int number = -50;
        String result = number > 0 ? "Positive" : "Negative";
        //System.out.println("Number: " + number + " - " + result + " Number");
        
        /*
        temp: 38.5 above -> Baby has a fever
        temp: 38.4 below -> Normal Temperature
        */  
        
        float temp = 38.5f;
        String result2 = temp >= 38.5 ? "Baby has a fever" : "Normal temperature";
        //System.out.println(result2);
        
        /*
            True -> Leap Year
            False -> Not Leap Year
        */
        int year = 2024;
        String result3 = (2024 % 4 == 0) ? "Leap Year" : "Not Leap Year";
        System.out.println(result3);
        
        
        
    }

}
