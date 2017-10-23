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
public class UnderscoreJustification {
    
    public String justifyLine(String[] words, int width){
    
        int totalLenght = 0;
        int totalUnderscores = 0;
        String result = "";
        String under = "";
        for(String str: words){
        
            totalLenght += str.length();
        }
        
        totalUnderscores = width - totalLenght;
        int used = totalUnderscores / (words.length-1);
        int resto = totalUnderscores % (words.length-1);
        int countTemp = used;
        for(int i = 0; i < words.length; i++){
            String str = words[i];
            while(countTemp > 0){
            
                under += "_";
                countTemp--;
            }
            countTemp = used;
            if(i < words.length-1){
                if(words[i].compareTo(words[i+1]) < 0){
                  if(resto > 0){
            
                       under += "_";
                       resto--;
                  }
                }
            }
            if(i != words.length-1)
              result += str + under;
            else
              result += str;
            
            under = "";    
        }
        
        
        return result;
    }
}

class TestaUnderscoreJustification{

    public static void main(String[] args){
    
        String[] c = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon"};
        
        System.out.println(new UnderscoreJustification().justifyLine(c, 32));
              
    }
}
