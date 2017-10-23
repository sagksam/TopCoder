/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * Monta uma equação a partir de uma string
 * @author PauloHenrique
 */
public class StringMath {
    
    public int whatIs(String desc){
    
        String[] c = desc.split(" ");
        int num1 = 0;
        int num2 = 0;
        for(String t: c){
        
            try{
                if(num1 == 0)
                  num1 = Integer.valueOf(t);
                if(t.contains("?"))
                  num2 = Integer.valueOf(t.substring(0, t.length()-1));
            }
            catch(Exception e){
              
                
            }
        }
        if(desc.contains("plus"))
            return num1 + num2;
        else if(desc.contains("minus"))
            return num1 - num2;
        else if(desc.contains("multiplied"))
            return num1 * num2;
        else
            return num1 / num2;
    }
}

class TestaStringMath{

    public static void main(String[] args){
    
        System.out.println(new StringMath().whatIs("What is 15 minus 3?"));
    }
}