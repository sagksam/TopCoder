/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * DONE ./ (O último teste definitivamente não dá para entender)
 * @author PauloHenrique
 */
public class ChessTourney {
    
    public double expectedWinning(int[] winnings, int[] odds){
    
        double[] newOdds = new double[odds.length+1];
        double total = 0;
        newOdds[0] = 100;
        int j = 1;
        for(int i = 0; i < odds.length; i++){        
                newOdds[j] = odds[i];
                j++;
        }
        for(int i = 1; i < newOdds.length; i++){
            
            if(newOdds[i] == 0)
                break;
            
            if(newOdds[i-1] != 100)
                newOdds[i] = newOdds[i-1] / (double) 2; 

        }
        for(int i = 0; i < newOdds.length; i++){
            
            if(newOdds[i] == 0)
                break;
                    
            total += newOdds[i] * winnings[i] / 100;
            
        }     
        return total;
    }
}

class TestaChessTourney{

    public static void main(String[] args){
    
        int[] winnings = {100, 100, 200, 400, 800, 1000};
        int[] odds = {100, 50, 25, 10, 5};
        new ChessTourney().expectedWinning(winnings, odds);
    }
}
