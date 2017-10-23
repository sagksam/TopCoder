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
public class BoxesOfBooks  {
    
    public int boxes(int[] weights, int maxWeight){
    
        int result = 0;
        int calc = 0;
        Arrays.sort(weights);
        System.out.println(Arrays.toString(weights));
        for(int i = 0; i < weights.length;){
            while(i < weights.length && calc + weights[i] <= maxWeight){
                calc += weights[i];
                i++;
            }          
            result++;
            calc = 0;
        }
        return result;
    }
}

class TestaBoxesOfBooks {

    public static void main(String[] args){
    
        int[] weights = {1, 1, 1, 7, 7, 7};
        new BoxesOfBooks().boxes(weights, 8);
    }
}