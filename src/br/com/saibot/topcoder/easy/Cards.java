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
public class Cards  {
    
    public String[] deal(int numPlayers, String deck) {
    
        String[] result = new String[numPlayers];
        if(deck.length() < result.length)
            return result;
        for(int i = 0; i < result.length; i++)
            result[i] = "";
        int count = 0;
        for(int i = 0; i < deck.length(); i++){        
            char c = deck.charAt(i);
            result[count] += c;
            count++;
            if(count == numPlayers)
                count = 0;
                    
        }
        return result;
    }
}

class TestaCards{

    public static void main(String[] args){
    
        new Cards().deal(6, "012345012345012345");
    }
}
