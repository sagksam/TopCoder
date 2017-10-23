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
public class CCipher {
    
    public String decode(String cipherText, int shift){
    
        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String result = "";
        for(int i = 0; i < cipherText.length(); i++){
        
            char c = cipherText.charAt(i);
            int temp = Arrays.binarySearch(alfabeto, c);
            int count = 0;
            while(count < shift){
            
                if(temp == -1)
                    temp = 25;
                                
                temp--;
                count++;
            }
            if(temp == -1)
                temp = 25;
            result = result + alfabeto[temp];
      
        }
        
        return result;
    
    }
}

class TestaCcipher {

    public static void main(String[] args){
    
        System.out.print(new CCipher().decode("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 10));
    
    }

}