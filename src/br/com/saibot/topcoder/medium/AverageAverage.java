/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

import java.util.ArrayList;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class AverageAverage {
    
    public double average(int[] numList){
    
      int numOfSubsets = 1 << numList.length; 
      double somaMedia = 0;
      for(int i = 0; i < numOfSubsets; i++){
        ArrayList<Integer> subset = new ArrayList<Integer>();  
        int pos = numList.length - 1;
        int bitmask = i; 
        while(bitmask > 0){
          if((bitmask & 1) == 1)
            subset.add(numList[pos]);
          bitmask >>= 1;
          pos--;
         }
       int total = 0;
          for (Integer subset1 : subset) {
              total += subset1;
          }

          if(subset.size() > 0)
             somaMedia += (total / (double) subset.size());
          
      }
      return somaMedia / (numOfSubsets-1);
    }  
}

class TestaAverageAverage{

    public static void main(String[] args){
    
        int[] numList = {3,1,4,15,9};
        new AverageAverage().average(numList);
    }
}