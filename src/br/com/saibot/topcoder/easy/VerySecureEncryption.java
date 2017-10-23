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
public class VerySecureEncryption  {
    
    public String encrypt(String message, int[] key, int K){
    
        char[] result = new char[key.length];
        while(K > 0){
            for(int i = 0; i < key.length; i++){
            
                result[key[i]] = message.charAt(i);
            }
            message = String.valueOf(result);
            K--;
        }
        return message;
    }
}

class TestaVerySecureEncryption  {

    public static void main(String[] args){
    
        int[] key = {4,3,2,1,0};
        new VerySecureEncryption ().encrypt("abcde", key, 1);
    }
}