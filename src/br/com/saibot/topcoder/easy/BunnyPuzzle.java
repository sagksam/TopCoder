/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.*;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class BunnyPuzzle  {
    
    public int theCount(int[] bunnies){
    
        int result = 0;
        int t = 0;
        List<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < bunnies.length; i++){
        
            if(i == 0 || i < bunnies.length-1){
                t = 2 * bunnies[i+1] - bunnies[i];
                if(Arrays.binarySearch(bunnies, t) < 0 && !temp.contains(t)){
                    result++;
                    temp.add(t);
                }    
            }
            if(i > 0){            
                t = 2 * bunnies[i-1] - bunnies[i];
                if(Arrays.binarySearch(bunnies, t) <  0 && !temp.contains(t)){
                    result++;
                    temp.add(t);
                }    
            }
        }
        return result;
    }
}

class TestBunnyPuzzle {

    public static void main(String[] args){
    
        int[] bunnies = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        new BunnyPuzzle ().theCount(bunnies);
    }
}