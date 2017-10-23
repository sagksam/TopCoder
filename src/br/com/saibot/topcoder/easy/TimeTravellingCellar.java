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
public class TimeTravellingCellar {
    
    public int determineProfit(int[] profit, int[] decay){
    
        int max = 0;
        int min = 5000000;
        int temp = -1;
        for(int i=0; i < profit.length; i++){
        
            if(profit[i] > max){
                max = profit[i];
                temp = i;
            }    
        }
        
        for(int i = 0; i < decay.length; i++){
        
            if(decay[i] < min && i != temp)
                min = decay[i];
                
        }
        
        return max - min;
    }
}

class TestaTimeTravellingCellar{

    public static void main(String[] args){
    
        int[] profit = {1000,500,250,125};
        int[] decay = {64,32,16,8};
        System.out.println(new TimeTravellingCellar().determineProfit(profit, decay));
    }
}
