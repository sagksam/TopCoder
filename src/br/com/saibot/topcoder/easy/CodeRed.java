/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class CodeRed {
    
    public int count(String text){
    
        String[] arrayRed = text.split(" ");
        int count = 0;
        for(String te: arrayRed){
        
            if(te.toLowerCase().contains("red"))
                count++;
        }
        
        return count;
    }
}

class TestaCodeRed{

    public static void main(String[] args){
    
        System.out.println(new CodeRed().count("pure deligh"));
    }
}