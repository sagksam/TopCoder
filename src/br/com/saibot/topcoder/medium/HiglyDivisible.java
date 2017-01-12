/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class HiglyDivisible {
    
    public long triangularNumber(int number){
    
        int result = 1;
        int count = 2;
        int countMultiple = 0;
        long n = 0;
        boolean isFinish = true;
        
        while(isFinish){
        
            for(int i = 2; i <= count; i++){
            
                result += i;
            }
            
            for(int i = 1; i <= result; i++){
            
                if(result % i == 0)
                    countMultiple++;
            }
            
            if(countMultiple > number){
                isFinish = false;
                n = result;
            }    
            
            result = 1;                        
            count++;
            countMultiple = 0;
        }
        
        return n;
        
    }
}

class TestaHiglyDivisible{

    public static void main(String[] args){
    
        new HiglyDivisible().triangularNumber(500);
    }
}