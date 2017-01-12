/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;
import java.util.Collections;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class Coherency {
    
    public int starters(int[]collection, int maxJump){
    
        //crescente
        Arrays.sort(collection);
        int temp = 1;
        int result = 0;
        for(int i = collection.length-1; i >= 1; i--){
        
            if(collection[i] - collection[i-1] <= maxJump)
                temp++;
        }
        
        
        if(temp == collection.length){
            result++;
        }
        
        temp = 1;
        //cria novo array
        Integer[] array = new Integer[collection.length];
        for(int i = 0; i < collection.length; i++){
        
            array[i] = collection[i];
        }
        //decrescente
        Arrays.sort(array, Collections.reverseOrder());
        
        for(int i = 0; i < collection.length-1; i++){
        
            if(array[i] - array[i+1] <= maxJump)
                temp++;
        }
        
        if(temp == collection.length){
            result++;
        }
        
        return result;
    
    }
}

class TestaCoherency{

    public static void main(String[] args){
    
        int[] collection = {8,1,1,1,1};
        System.out.print(new Coherency().starters(collection, 6));
    
    }

}