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
public class FleasFleas {
    
    public int population(int n, int k){
    
        int temp = n;
        int result = n;
        int c;
        while(k > 0){
            
            result += temp * k;
            c = temp * k;
            temp = c;
            k = k - 5;
        }
        
        if(result < 0)
            return-1;
        
        return result;
    }
}

class TestaFleasFleas{

    public static void main(String[] args){
    
        new FleasFleas().population(56, 23);
    }
}