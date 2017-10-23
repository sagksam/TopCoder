/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * DONE \./
 * @author PauloHenrique
 */
public class CostOfDancing {
    
    public int minimum(int K, int[] danceCost){
    
        int min = 0;
        
        Arrays.sort(danceCost);
        for(int i = 0; i < K; i++){
        
            min += danceCost[i];
        }
        return min;
    }
}

class TestCostOfDancing{

    public static void main(String[] args){
    
        int[] danceCost = {2,2,4,5,3};
        System.out.println(new CostOfDancing().minimum(1, danceCost));
    }
}