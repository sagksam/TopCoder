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
public class TrophyShelf {
    
    public int[] countVisible(int[]trophies){
    
        int[] result = {1,1};
        int left = trophies[0];
        int right = trophies[trophies.length-1];
        for(int i = 1; i < trophies.length; i++){
                 
            if(trophies[i] > left){
                result[0]++;
                left = trophies[i];
            }    
        }
             
        for(int i = trophies.length-2; i > 0; i--){

            if(trophies[i] > right){
                result[1]++;
                right = trophies[i];
            }
        }
        
        return result;
    }
}

class TestaTrophyShell{

    public static void main(String[] args){
    
        int[] trophies = {1,2,3,4,5};
        new TrophyShelf().countVisible(trophies);
    }
}
