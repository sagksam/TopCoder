/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;


/**
 * COPIANDO ALGORITMO
 * @author PauloHenrique
 */
public class TwoTrains  {
    
    
        public int passengerNewVasyuki(int t1, int t2, int[] times){
        
            int ans = 0; 
            for(int time : times) { 
            int nextTrain1 = 0, nextTrain2 = 0; 
            while (nextTrain1 < time) nextTrain1 += t1; 
            while (nextTrain2 < time) nextTrain2 += t2; 
            if (nextTrain1 <= nextTrain2) ++ans; 
        } 
        return ans; 
     }        
}

class TestaTwoTrains{

    public static void main(String[] args){
    
        int[] times = {0,1,2,3,4,5,6,7,8,9,10};
        new TwoTrains().passengerNewVasyuki(3, 2, times);
    }
}