/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage1.day6;

/**
 *
 * @author Yuno
 */
public class SwitchStatement {
    
    public static void main(String[] args) {
        /*
            1 -> Monday
            2 -> Tuesday
        */
        
        int day = 3;
        
        
        switch(day){
            case 1:
                System.out.println("Monday");
                break; // break statement
            case 2:
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wendesday");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
