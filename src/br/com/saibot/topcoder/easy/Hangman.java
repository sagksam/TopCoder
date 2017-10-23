/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;
import java.util.*;
/**
 * DONE ./
 * @author PauloHenrique
 */
public class Hangman {
    
    public  String guessWord(String feedback, String[] words){  
        
        TreeSet<String> consistent = new TreeSet<String>();
        
        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            if (word.length() == feedback.length()) {
                for(int i = 0; i < feedback.length(); i++){
                
                    if(feedback.charAt(i) != '-'){
                    
                        if(word.charAt(i) != feedback.charAt(i))
                            words[j] = "";
                    }
                }
                
            }
            else
                words[j] = "";
        }
        for(int i = 0; i < words.length; i++){
        
            if(!words[i].equals("")){
            
                for(int j = 0; j < feedback.length(); j++){
                    int countF = 0;
                    int countW = 0;
                    if(feedback.charAt(j)!= '-'){
                        countF = countChar(feedback, feedback.charAt(j));
                        countW = countChar(words[i], feedback.charAt(j));
                        if(countF == countW)
                            consistent.add(words[i]);
                    }    
                }
            }
                
        }
        if(consistent.size() > 1 || consistent.isEmpty())
            return "";
        else
            return consistent.first();
            
    }
    
    public int countChar(String c, char t){
    
        int count = 0;
        for (int i=0; i < c.length(); i++){
            if (c.charAt(i) == t) {
                count++;
            }
        }
        return count;
    }
}

class TestaHangman{

    public static void main(String[] args){
    
        String[] words = {"NINJA", "NINJAS", "FLIPS", "OUT", "FRISBEE"};
        System.out.println(new Hangman().guessWord("N-N-A", words));
    }
}