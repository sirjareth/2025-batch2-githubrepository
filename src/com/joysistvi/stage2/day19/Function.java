/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage2.day19;


public class Function {

    public static void main(String[] args) {
        Function f = new Function();
        f.jump("Back Flip");
        
    }
    
    public void jump(){
        System.out.println("Normal Jumpo");
    }
    
    public void jump(int noOfJump){
        System.out.println("Jump " + noOfJump);
    }
    
    protected void jump(String style){
        System.out.println("Jump " + style);
    }
      
    public void jump(String style, int noOfJump){
        
    }
    
    
    public void jump(String style, int noOfJump, double height){
        
    }
    
    
    public void jump(String style, double height, int noOfJump){
        
    }
    
}
