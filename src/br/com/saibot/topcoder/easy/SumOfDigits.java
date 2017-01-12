/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 *
 * @author PauloHenrique
 */
public class SumOfDigits {
    
    public int sum(int number){
    
        int result = 0;
        
        String temp = String.valueOf(number);
        for(int i = 0; i < temp.length(); i++){
        
            char c = temp.charAt(i);
            result += Character.getNumericValue(c);
        }
        
        return result;
    }
}

class TestaSumOfDigits{

    public static void main(String[] args){
    
        System.out.println(new SumOfDigits().sum(565));
    }
}