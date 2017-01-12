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
public class ArmstrongNumber {
    
    public boolean isArmstrong(int number){
        
        String c = String.valueOf(number);
        int sum = 0;
        for(int i = 0; i < c.length(); i++){
                    
            char f = c.charAt(i);
            sum += Math.pow(Character.getNumericValue(f), 3);
         }               
         return(sum==number);
    }
}

class TestaArmstrongNumber{

    public static void main(String[] args){
    
        System.out.println(new ArmstrongNumber().isArmstrong(153));
    }
}