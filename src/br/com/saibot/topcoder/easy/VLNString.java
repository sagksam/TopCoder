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
public class VLNString  {
    
    public String makeAcronym(String longName){
    
        String[] words = longName.split(" ");
        String result = "";
        for(String word: words){
            if(word.length() > 0){
              if(word.equals("the") || word.equals("of") || word.equals("and"));
              else
                   result += word.charAt(0);
            }
        }
        
        return result.toUpperCase();
    }
}

class TestaVLNString {

    public static void main(String[] args){
    
        System.out.println(new VLNString ().makeAcronym(" return of the king "));
    }
}