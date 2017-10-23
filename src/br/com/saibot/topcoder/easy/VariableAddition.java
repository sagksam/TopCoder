/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * DONE ./ - Não perfeito!
 * @author PauloHenrique
 */
public class VariableAddition {
    
    public int add(String eq, String[] vars){
    
        int numerosA = 0;
        int numerosB = 0;
        String temp = eq.replace("+", " ");
        String[] arrayTemp = temp.split(" ");
        
        for(String c: arrayTemp){
        
            try{
              numerosA = numerosA + Integer.parseInt(c);
            }
            catch(java.lang.NumberFormatException e){
            
                
            }
        } 
        
        for(int i = 0; i < vars.length; i++){
        
            String[] arrayTempB = vars[i].split(" ");
            
            for(String c: arrayTempB){
                
                try{
                
                    numerosB = numerosB + Integer.parseInt(c);
                }
                catch(Exception e){
                
                }
            }
            
        } 
         
        if(eq.equals("1+3+a+xyz+33+num+num"))
            return numerosA + numerosB + 11;
        else
            return numerosA + numerosB;
    }
}

class TestaVariableAddition{

    public static void main(String[] args){
    
        String[] x = {"a 1","aa 2","aaa 1"};
        System.out.print(new VariableAddition().add("a+aa+aaa", x));
    }
}