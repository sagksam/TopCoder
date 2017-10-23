/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

import java.util.Arrays;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class MagicCandy {
    
    public int whichOne(int n){
    
        if(n==1)
            return 1;
        boolean[] bol = new boolean[n+1];
        int[] arrayInt = new int[n+1];
        boolean isTrue = true;
        int count = 1;
        
        while(isTrue){
          for(int i = 1; i < arrayInt.length; i++){
            
              if(!bol[i]){
            
                if(Math.round(Math.sqrt(count))==Math.sqrt(count)){                
                  bol[i] = true;
                }
                count++;
            
              }
          }
        
        count = 1;
        if(countFalse(bol) == 1)
            isTrue = false;
        }
        
        for(int i = 1; i < bol.length; i++){
        
            if(!bol[i])
                return i;
        }
        
        return 0;
    }
    
    public int countFalse(boolean[] bol){
    
        int count = 0;
        
        for(int i = 1; i < bol.length; i++){
        
            if(!bol[i])
                count++;
        }
        
        return count;
    }
}

class TestaMagicCandy{

    public static void main(String[] args){
    
        System.out.println(new MagicCandy().whichOne(20111223));
    }
}
