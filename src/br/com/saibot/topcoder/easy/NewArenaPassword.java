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
public class NewArenaPassword  {
    
    public int minCHange(String oldPassword, int K){
    
        String firstOne = oldPassword.substring(0, K);
        System.out.println(firstOne);
        String lastOne = oldPassword.substring(oldPassword.length() - K, oldPassword.length());
        System.out.println(lastOne);
        int count = 0;
        for(int i = 0; i < firstOne.length(); i++){
        
            if(firstOne.charAt(i) != lastOne.charAt(i))
                count++;
        }
        
        return count;
    }
}

class TestaNewArenaPassword {

    public static void main(String[] args){
    
        new NewArenaPassword().minCHange("topcoderopen", 5);
    }
}