/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 *
 * @author PauloHenrique
 */
public class FingerCounting {
    
    public int maxNumber(int weakFinger, int maxCount){
    
        int count = 0;
        int result = 0;
        
        while(count <= maxCount){
        
            for(int i = 1; i <= 5; i++){                
                  result++;
                  if(i == weakFinger)
                    count++;
            }
            for(int i = 4; i >= 2; i--){
                 result++;
                 if(i == weakFinger)
                    count++;
            }
            if(count == maxCount)
                      break;
        }
        System.out.println(result);
        return result;
    }
}

class TestFingerCounting{

    public static void main(String[] args){
    
        new FingerCounting().maxNumber(2, 3);
    }
}