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
public class EggCartons {
    
    public int minCartons(int n){
    
        int i = n;
        int carton = 0;
        
        if(n % 2 == 1 || n < 6)
            return -1;
        
        if(n % 8 == 0)
            return n / 8;        
        else{
            while(n >= 0 && n % 8 != 0) {
		carton++;
		n = n - 6;
            }   
            System.out.println(carton);
             System.out.println(n);
            if(n >= 0){
            
                carton += n / 8;
		return carton;
            }
            return carton;                                 
        }
    }
}

class TestaEggCartons{

    public static void main(String[] args){
    
        System.out.print(new EggCartons().minCartons(36));
    }
}