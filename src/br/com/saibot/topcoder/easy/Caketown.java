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
public class Caketown {
    
    public int howManyBites(int[] cakeSize, int numFriends){
    
        int maior = 0;
        Arrays.sort(cakeSize);
        for(int i = cakeSize.length-1; i >= 0; i=i-(numFriends+1)){
        
           System.out.println(cakeSize[i]); 
           maior = maior + cakeSize[i];
           
 
        }
        
        return maior;
    
    }
}


class TestaCakeTown{

    public static void main(String[] args){
    
        int [] i = {1,1,1,5,1};
        new Caketown().howManyBites(i, 3);
    
    }

}