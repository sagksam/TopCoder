/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * DONE ./ (Bug em um teste!)
 * @author PauloHenrique
 */
public class BigBurger  {
    
    public int maxWait(int[] arrival, int[] service){
        
        if(arrival.length == 1)
            return 0;
        int max = 0;
        int[] temp = new int[arrival.length];
        temp[0] = arrival[0] + service[0];
        for(int i = 0; i < arrival.length; i++){
        
            if(i > 0){
            
                temp[i] = service[i] + temp[i-1];
            }
                
        }
        System.out.println(Arrays.toString(temp));
        for(int i = 1; i < temp.length; i++){
       
            if(temp[i-1] - arrival[i] > max)
                max = temp[i-1] - arrival[i];
        }
        
        return max;
    }
}

class TestaBigBurger {

    public static void main(String[] args){
    
        int[] arrival = {2,10,11};
        int[] service = {3,4,3};
        
        System.out.println(new BigBurger().maxWait(arrival, service));
    }
}