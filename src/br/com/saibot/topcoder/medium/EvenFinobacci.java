/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

/**
 * DONE ./ copiando algoritmo
 * @author PauloHenrique
 */
public class EvenFinobacci {
    
    public long numbers(int number){
    
        int x  = 0;
        int y = 1;
        int z = x + y;
        int result = 0;
        while(z < number){
        
            x = y;
            y = z;
            z = x + y;
            if(z % 2 == 0)
                result += z; 
        }
        
        return result;
    }
}

class TestaEvenFinobacci{

    public static void main(String[] args){
    
        System.out.println(new EvenFinobacci().numbers(4000000));
    }
}
