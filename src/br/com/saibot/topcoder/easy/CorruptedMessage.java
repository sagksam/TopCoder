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
public class CorruptedMessage  {
 
    public String reconstructMessage(String s, int k){
    
        if(k == 0)
            return s;
        String result = ""; 
        if(k == s.length()){
        
            for(int i = 0; i < s.length(); i++){
            
                if(s.charAt(i) != 'd')
                    result += "d";
            }
            return result;
        }
        char[] c = s.toCharArray();
        int[] countLetter = new int[c.length];
        
        for(int i = 0; i < s.length(); i++){
        
            for(int j = 0; j < c.length; j++){
            
                if(s.charAt(i) == c[j])
                    countLetter[j]++;
            }
        }
        int max = 0;
        int index = 0; 
        for(int i = 0; i < countLetter.length; i++){
        
            if(countLetter[i] > max){
                max = countLetter[i];
                index = i;
            }    
        }
        for(int i = 0; i < s.length(); i++){
        
            result += c[index];
        }
        return result;
    }
}

class TestaCorruptedMessage {

    public static void main(String[] args){
    
        new CorruptedMessage ().reconstructMessage("jlmnmiunaxzywed", 13);
    }
}