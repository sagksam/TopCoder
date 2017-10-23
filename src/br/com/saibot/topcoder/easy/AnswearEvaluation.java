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
public class AnswearEvaluation {
    
    public int getScore(String[]keywords, int[]scores, String answear){
    
        int score = 0;
        int[]palavrasEncontradas = new int[keywords.length];
        String[] answearArray = answear.split(" ");
        
        for(int i = 0; i < keywords.length; i++){
        
            for(String word: answearArray)
                if(keywords[i].equals(word))
                    palavrasEncontradas[i] = 1;
        }
        
        
        for(int i = 0; i < palavrasEncontradas.length; i++){
        
            if(palavrasEncontradas[i] == 1)
                score = score + scores[i];
        }
        
        return score;
    }
}

class TestaAnswearEvaluation{

    public static void main(String[] args){
    
        int[]scores = {1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000};
        String[] keywords = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "x", "y", "z"};
        System.out.print(new AnswearEvaluation().getScore(keywords, scores, "a b c d e f g h i j k l m n o p q r s t u v x y z"));
    }
}
