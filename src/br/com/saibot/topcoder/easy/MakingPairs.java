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
public class MakingPairs{
    
    public int get(int[] card){
    
        int result = 0;
        
        while(verificaDois(card)){
            
            for(int i = 0; i < card.length; i++){
                
                if(card[i] >= 2){
                    card[i]-= 2;
                    result++;
                }            
            }
        }

        
        return result;
    }
    
    public boolean verificaDois(int[] card){
    
        for(int c: card)
            if(c >= 2)
                return true;
        
        return false;
    }
}

class TestaMakingPairs{

    public static void main(String[] args){
    
        int[] card = {0};
        System.out.println(new MakingPairs().get(card));
    }
}