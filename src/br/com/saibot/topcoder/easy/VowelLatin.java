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
public class VowelLatin  {
    
    public String translate(String word){
    
        char[] vowelUpper = {'A','E','I','O','U',};
        char[] vowelLower = {'a','e','i','o','u'};
        String replace = "";
        String temp = "";
        for(int i = 0; i < word.length(); i++){
            
              char c = word.charAt(i);
                if(Arrays.binarySearch(vowelUpper, c) >= 0 || Arrays.binarySearch(vowelLower, c) >= 0)
                    temp += c;
                else
                    replace += c;
        }
        
        return replace + temp;
    }
}

class TestaVowelLatin {

    public static void main(String[] args){
    
        System.out.println(new VowelLatin ().translate("aeioOa"));
    }
}