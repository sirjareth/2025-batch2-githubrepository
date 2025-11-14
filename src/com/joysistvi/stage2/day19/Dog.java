/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage2.day19;


// inheritance 
public class Dog implements Animal{
    
    public static void main(String[] args) {
        
    }

    @Override
    public void eat(){
        System.out.println("crunch crunch...");
    }
    
    @Override
    public void jump(){
        System.out.println("jump...");
    }
    @Override
    public void swim(){
        System.out.println("langoy aso...");
    }
    
    
}
