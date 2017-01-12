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
public class LargestPalindrome {
    
    public int findLargest(){
    
        int number = 100;
        int result = 0;
        int largest = 0;
        while(number < 1000){
            
          for(int i = 100; i < 1000; i++){
        
             result = number * i;
             if(isPalindrome(result)){
                 if(result > largest)
                     largest = result;
             }    
          }
          
          number++;
        
        } 
        
        
        return largest;
    }
    
    private boolean isPalindrome(int result){
    
        String stringR = String.valueOf(result);
        StringBuilder buffer = new StringBuilder(stringR);  
        return stringR.equals(buffer.reverse().toString());
    }
}

class TestaLargestPalindrome{

    public static void main(String[] args){
    
        System.out.println(new LargestPalindrome().findLargest());
    }
}