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
public class TheJackpotDivTwo {
    
    public int[] find(int[]money, int jackpot){
    
        int min = money[0];
        int j = 0;
        while(jackpot > 0){
        
            for(int i = 0; i < money.length; i++){
            
                if(money[i] <= min){
                    min = money[i];
                    j = i;
                }    
            }
            
            money[j] += 1;
            jackpot--;
        }
        
        Arrays.sort(money);
        return money;
        
    }
}

class TestaTheJackpotDivTwo{

    public static void main(String[] args){
    
        int[] money = {21, 85, 6, 54, 70, 100, 91, 60, 71};
        new TheJackpotDivTwo().find(money, 15);
    }
}