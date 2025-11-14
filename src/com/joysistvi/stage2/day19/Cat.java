/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage2.day19;


public class Cat implements Breed, Animal{
    
    @Override
    public void eat(){
        System.out.println("meow");
    }
    @Override
    public void jump(){
        System.out.println("jump high");
    }
    @Override
    public void swim(){
        System.out.println("langoy pusa");
    }
    
    
    @Override
    public void hasBreed(){
        
    }
}
