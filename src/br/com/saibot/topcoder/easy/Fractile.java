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
public class Fractile {
    
    public int fractile(int x[], int p){
    
        int count = 0;
        double[] percentNumbers = new double[x.length];
        int min = 0;
        for(int i = 0; i < x.length; i++){
        
            int numeroComparacao = x[i];
            
            for(int j = 0; j < x.length; j++){
                if(x[j] <= numeroComparacao)
                    count++;
            }
            
            double percent = count / (double) x.length * 100;
            percentNumbers[i] = percent;
            
            count = 0;
        }

        double valorMinimo = 0;
        for(int i = 0; i < percentNumbers.length; i++){
        
            if(percentNumbers[i] - p > 0){
                valorMinimo = percentNumbers[i] - p;
                break;
            }    
                
        }

        for(int i = 0; i < percentNumbers.length; i++){
                           
            double temp = percentNumbers[i] - p;
            
            if(temp <= valorMinimo && temp >= 0){
                valorMinimo = temp;
                min = i;
            }    
        }
        return x[min];
    }
}

class TestaFractile{

    public static void main(String[] args){
    
        int[] x = {-3,-5,2,1};
        System.out.println(new Fractile().fractile(x, 50));
    }
}