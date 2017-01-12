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
public class EratostenesSieve {
    
    public boolean[] findPrimeNumber(boolean[] array){
        
        for(int i = 2; i<array.length; i++){
            
            if(i % 2 == 0){
                array[i] = false;
            }
            if(i % 3 == 0){
                array[i] = false;
            }
        }
        
        for(int i = 0; i < array.length; i++){
            
            System.out.printf("Índice: %d valor: %b\n", i, array[i]);
        }
        
        return array;
    }
       
}

class TestaEratostenesSieve{
   
    
    public static void main(String[] args){
        
        boolean[] array = new boolean[10000];
    
        for(int i = 0; i < array.length; i++){
            array[i] = true;
        }
        
        new EratostenesSieve().findPrimeNumber(array);
    }
}
