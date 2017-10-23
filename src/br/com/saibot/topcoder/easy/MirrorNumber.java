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
public class MirrorNumber {
    
    public long sequence(int number){ 
        
        String temp = "";
        for(int i = 1; i <= number; i++){
            
            temp = temp + i;
        }
        
        for(int i = number-1; i >=1; i--){
            
            temp = temp + i;
        }
        
        long newNumber = Long.parseLong(temp);
       
        return newNumber;

	
    }
}

class TestaMirrorNumber{

    public static void main(String[] args){
    
        System.out.println(new MirrorNumber().sequence(7));
    }
}