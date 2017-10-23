/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class LuckyCounter {
    
    public int countLuckyMoments(String[] moments){
    
        int result = 0;
        for(String c: moments){
        
            if(c.charAt(0) == c.charAt(3) && c.charAt(1) == c.charAt(4)){
                result++;
                continue;
            }    
            if(c.charAt(0) == c.charAt(1) && c.charAt(3) == c.charAt(4)){
                result++;
                continue;
            }   
            if(c.charAt(0) == c.charAt(4) && c.charAt(1) == c.charAt(3)){
                result++;
                continue;
            }    
        }
        
        return result;
    }
}

class LuckyCounterTest{

    public static void main(String[] args){
    
        String[] moments = {"12:11", "22:22", "00:01", "03:30", "15:15", "16:00"};
        System.out.println(new LuckyCounter().countLuckyMoments(moments));
    }
}