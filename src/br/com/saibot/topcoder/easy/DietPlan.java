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
public class DietPlan  {
    
    public String chooseDinner(String diet, String breakfast, String lunch){
    
        String result = "";
        String meat = breakfast + lunch;
        
        for(int i = 0; i < meat.length(); i++){
        
            if(!diet.contains(String.valueOf(meat.charAt(i))))
                return "CHEATER";
        }

        for(int i = 0; i < diet.length(); i++){
            
            if(!meat.contains(String.valueOf(diet.charAt(i))))
                result += diet.charAt(i);     
        }
        
        char[] chars = result.toCharArray();
        Arrays.sort(chars);       
        return new String(chars);
    }
    
}

class TestaDietPlan {

    public static void main(String[] args){
    
        System.out.println(new DietPlan ().chooseDinner("EDSMB", "MSD", "A"));
    }
}