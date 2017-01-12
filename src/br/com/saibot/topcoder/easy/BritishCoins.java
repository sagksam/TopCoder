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
public class BritishCoins {
    
    public int[] coins(int pence){
    
        int pound = 0;
        int shilling = 0;
        int pennie = 0;
        boolean isPound = false;
        boolean isShilling = false;
        
        while(!isPound && pence >=240){
        
            pence = pence - 240;
            pound++;
            
            if(pence <= 240)
                isPound = true;
        
        }

        
        while(!isShilling && pence >=12){
        
            pence = pence - 12;
            shilling++;
            
            if(pence <= 12)
                isShilling = true;
        }
        
                
        System.out.println(pound);
        System.out.println(shilling);
        System.out.println(pence);
        
        int[] c = {pound, shilling, pence};
        
        System.out.println(Arrays.toString(c));
        
        return c;
    
    }
}

class TestaBritishCoins{

    public static void main(String[] args){
    
        new BritishCoins().coins(4091);
    
    }

}
