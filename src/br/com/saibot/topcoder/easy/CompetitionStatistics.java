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
public class CompetitionStatistics {
    
    public int consecutiveGrowth(int[] ratingChanges){
    
        int result = 0;
        int max = 0;
        for(int i = 0; i < ratingChanges.length; i++){
        
            if(ratingChanges[i] > 0)
                result++;
            else{
                if (result > max)
                    max = result;
                result = 0;
            }    
        }
        if (result > max)
             max = result;
        
        return max;
    }
}

class TestaCompetitionStatistics{

    public static void main(String[] args){
    
        int[]ratingChanges = {-6, 13, 15, -11, 12, 12, 33, 12, -1};
        new CompetitionStatistics().consecutiveGrowth(ratingChanges);
    }
}