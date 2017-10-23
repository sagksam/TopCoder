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
public class SmallestNumber {
    
    public int smallest(int n){
    
        int number = 1;
        boolean continua = true;
        while(continua){
          for(int i = 1; i <= n; i++){        
              if(number % i != 0){
                  number++;
                  break;                  
              }
              else if(i == n && number % i == 0){
              
                  continua = false;
              }
          }
        }
        
        return number;
    }
}

class TestaSmallestNumber{

    public static void main(String[] args){
    
        System.out.println(new SmallestNumber().smallest(20));
    }
}
