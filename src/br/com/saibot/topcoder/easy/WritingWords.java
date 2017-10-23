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
public class WritingWords {
    
    public int write(String word){
        int count = 0;
        char[] alphabet = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String newWord = word.toLowerCase();       
        for(int i = 0; i < newWord.length(); i++){
        
            char c = newWord.charAt(i);
            for(int j = 0; j < alphabet.length; j++){
                if(c == alphabet[j])
                    count += j;
            }
        }
        return count;
    }
}

class TestaWritingWords{

    public static void main(String[] args){
    
        new WritingWords().write("VAMOSGIMNASIA");
    }
}