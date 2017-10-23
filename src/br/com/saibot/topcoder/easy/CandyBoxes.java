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
public class CandyBoxes  {
    
    public int remainingCandies(int[] candies){
    
        if(candies.length == 1)
            return candies[0];
        else{
        
            while(!isEqual(candies)){
            
                int max = 0;
                int min = 5000;
                
                for(int i = 0; i < candies.length; i++){
                
                    if(candies[i] < min)
                        min = candies[i];
                    if(candies[i] > max)
                        max = candies[i];
                }
                
                for(int i = 0; i < candies.length; i++){
                
                    if(candies[i] == max)
                        candies[i] -= min;
                }
                
            }
            
            return candies[0];
        }
    }
    
    public boolean isEqual(int[] candies){
    
        for(int i = 0; i < candies.length-1; i++){
        
            if(candies[i] != candies[i+1])
                return false;
        }
        return true;
    }
}

class TestaCandyBoxes {

    public static void main(String[] args){
    
        int[]candies = {366, 549, 915, 183, 549, 549, 183, 366, 915, 549, 915, 366};
        new CandyBoxes ().remainingCandies(candies);
    }
}