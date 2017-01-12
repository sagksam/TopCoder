/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DONE ./ (copiando algoritmo)
 * @author PauloHenrique
 */
public class EratosthenSieve2  {
    
    public int nthElement(int n){
    
        boolean[] array = new boolean[1001]; 
   
        int k = 2;
        
        while(k <= 10){
            int temp = 0;
            for(int i = 1; i < 1001; i++){
            
                if(!array[i])
                    ++temp;
                if(temp % k == 0){
                    array[i] = true;
                }    
            }
            ++k;
        } 
        int count = 0;
        for (int i = 1; i < 1001; ++i) {
           if (!array[i]) {
              ++count;
           if (count == n)
           return i;
        }
       }
       return 0;
    }
}


class TestaEratosthenSieve2 {

    public static void main(String[] args){
    
        System.out.println(new EratosthenSieve2 ().nthElement(3));
    }
}