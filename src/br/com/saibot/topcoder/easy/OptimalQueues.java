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
public class OptimalQueues {
    
    public int minWaitingTime (int[] clientArrivals, int tellerCount, int serviceTime){
    
       Arrays.sort(clientArrivals);
       int[] tempArray = new int[clientArrivals.length];
       int countTeller = 1;
       for(int i = clientArrivals.length-1; i >= 0; i--){
       
           if(countTeller <= tellerCount){
               
               tempArray[i] = clientArrivals[i] + serviceTime;
           }
           else{
           
               tempArray[i] = clientArrivals[i] + serviceTime + serviceTime;
           }
           countTeller++;
       }
       Arrays.sort(tempArray);
       return tempArray[tempArray.length-1];
    }
}

class TestarOptimalQueues{

    public static void main(String[] args){
    
        int[] clientArrivals = {10,10,10};
        new OptimalQueues().minWaitingTime(clientArrivals, 2, 20);
        
    }
}
