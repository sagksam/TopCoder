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
public class PalindromeCheck {
    
    public boolean isPalindrome(String word){
    
        String temp = word.toLowerCase();
        String pal = "";
        char[] c = new char[temp.length()];
        for(int i = 0; i < temp.length(); i++){
        
            c[i] = temp.charAt(i);
        }
        for(int i = c.length-1; i >= 0; i--){
            pal += c[i];
        }
        return temp.equals(pal);
    }
}

class TestaPalindromeCheck{

    public static void main(String[] args){
    
        new PalindromeCheck().isPalindrome("Anna");
    }
}