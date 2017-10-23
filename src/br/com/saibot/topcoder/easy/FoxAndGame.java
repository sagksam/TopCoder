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
public class FoxAndGame {
    
    public int countStars(String[] result){
    
        int count = 0;
        for(int i = 0; i < result.length; i++){
        
            for(int j = 0; j < result[i].length(); j++){
                
               char temp = result[i].charAt(j);
               if(Character.toString(temp).equals("o"))
                 count++;
            }
        }
        
        return count;
    
    }
}

class TestaFoxAndGame{

    public static void main(String[] args){
        String[] c = {"ooo", "oo-", "o--"};
        System.out.print(new FoxAndGame().countStars(c));
    }
}
