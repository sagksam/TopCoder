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
public class DengklekTryingToSleep  {
    
    public int minDucks(int[] ducks){
        
        Arrays.sort(ducks);
        int max = ducks[ducks.length-1];
        int min = ducks[0];
        int count = 0;
        for(int i = min; i <= max; i++){
        
            int temp = Arrays.binarySearch(ducks, i);
            if(temp < 0)
                count++;
        }
        
        return count;
    }
}

class TestaDengklekTryingToSleep {

    public static void main(String[] args){
    
        int[] ducks = {7, 4, 77, 47, 74, 44};
        System.out.println(new DengklekTryingToSleep ().minDucks(ducks));
    }
}