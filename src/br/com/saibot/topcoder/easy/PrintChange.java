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
public class PrintChange {
    
    public int restOne(int number){
    
        int[] arrayNumber = new int[number+1];
        arrayNumber[0] = -50;
        while(thereYet(arrayNumber)){
          for(int i = 1; i < arrayNumber.length; i++){
              
              if(arrayNumber[i] == 0){
                  arrayNumber[i] = -50;
                  break;
              }    
          }
          for(int i = arrayNumber.length-1; i > 0; i--){
              
              if(arrayNumber[i] == 0){
                  arrayNumber[i] = -50;
                  break;
              }    
          }
        }
        
        for(int i = 0; i < arrayNumber.length; i++){
            
            if(arrayNumber[i] == 0)
                return i;
        }
        
        return 0;
    }
    
    public boolean thereYet(int number[]){
    
        int count = 0;
        
        for(int i = 1; i < number.length; i++){
        
            if(number[i] == 0)
                count++;
        }
        
        return count > 1;
                    
    }
}

class TestaPrintChange{

    public static void main(String[] args){
    
        System.out.println(new PrintChange().restOne(117));
    }
}