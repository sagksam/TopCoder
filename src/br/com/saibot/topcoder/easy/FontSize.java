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
public class FontSize  {
    
    public int getPixelWidth(String sentence, int[] uppercase, int[] lowercase){
    
        char[] alpUpper = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] alpLower = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int count = 0;
        int indexUp = -1;               
        int indexLw = -1;
        for(int i = 0; i < sentence.length(); i++){
        
            char letter = sentence.charAt(i);
            
            if(letter == ' '){
               count += 3;
            }   
            else{
               indexUp = Arrays.binarySearch(alpUpper, letter);               
               indexLw = Arrays.binarySearch(alpLower, letter);
            }
            if(indexUp >= 0)
                count += uppercase[indexUp];  
            if(indexLw >= 0)
                count += lowercase[indexLw];  
            
            indexUp = -1;               
            indexLw = -1;
            if(i < sentence.length()-1)
              count++;
        }
        System.out.println(count);
        return count;
    }
}

class TestaFontSize {

    public static void main(String[] args){
    
        int[] uppercase = {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
        int[] lowercase = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
        new FontSize ().getPixelWidth("two  spaces", uppercase, lowercase);
    }
}