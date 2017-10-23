/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class SummationPrimes {
    
    public long sum(int value){
        
        int N = value+1;
        long result = 0;
        boolean[] prime = new boolean[N+1];
        for(int i = 2; i < N; i++){
        
            prime[i] = true;
        }
        for(int i = 2; i < N; i++){
        
            if(prime[i])
                result += i;
            
            for(int j = 2; j * i <=N; j++)
                prime[i * j] = false;
        }
        
        
        return result;
    
    }
}

class TestaSummationPrimes{

    public static void main(String[] args){
    
        System.out.println(new SummationPrimes().sum(2000000));
    }
}