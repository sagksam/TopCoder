/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * Faz uma pesquisa binária em um array
 * @author PauloHenrique
 */
public class BinarySearch {
    
    public int binarySearch(int[] array, int target){
    
        Arrays.sort(array);
        int max = array.length -1;
        int min = 0;
        int guess = max / 2;
        while(array[guess] != target){
        
            if(min > max)
                return -1;           
            if(array[guess] < target)           
                min = guess +1;
            else if(array[guess] > target)
                max = guess -1;
            
            guess = (max + min) / 2;
        }
        return guess;
    }
}

class TestaBinarySearch{

    public static void main(String[] args){
    
       int[] array = {6};
       System.out.println(new BinarySearch().binarySearch(array, 6));
       
    }
}