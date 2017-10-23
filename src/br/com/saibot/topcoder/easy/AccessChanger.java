/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class AccessChanger {
    
    public String[] convert(String[] program){
        
        String[] result = new String[program.length];
        
        int cont = 0;
        
        for(int i = 0; i < program.length; i++){
            
            cont = program[i].indexOf("//");
            if(cont != -1){
                String temp = program[i].substring(0, cont).replaceAll("->", "\\.");
                result[i] = temp + program[i].substring(cont);

            }
            if(cont == -1){
                result[i] = program[i].replaceAll("->", "\\.");
            }
            
      
        }  
        
        System.out.println(Arrays.toString(result)); 

        
        return result;
    }
        
}


class TestaAccessChanger{
    
    public static void main(String[] args){
        
        String[] temp = {"Test* t = new Test();", "t->a = 1;", "t->b = 2;", "t->go(); // a=1, b=2 --> a=2, b=3"};
        new AccessChanger().convert(temp);
    }
} 