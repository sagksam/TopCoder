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
public class SendingCards {
    
    public int howMany(String[] friends){
    
        int c = 0;
        for(int i = 0; i < friends.length; i++){
        
            for(int j = 0; j < friends[i].length(); j++){
            
                if(friends[i].charAt(j) == 'Y' && friends[j].charAt(i) == 'N')
                    c++;            
            }
        }
        
        return c;
    }
}

class TestaSendingCards{

    public static void main(String[] args){
    
        String[] n = {"NYN", "YNN", "NNN"};
        System.out.println(new SendingCards().howMany(n));
    }
}