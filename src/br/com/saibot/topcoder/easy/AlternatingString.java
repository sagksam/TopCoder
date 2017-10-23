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
public class AlternatingString  {
    
    public int maxLength(String s){
    
        int result = 1;
        int max = 0;
        for(int i = 0; i < s.length()-1; i++){
        
            char c = s.charAt(i);
            if(s.charAt(i) != s.charAt(i+1)){                
                result++;
            }
            else{
                if(result > max){
                    max = result;
                }
                if(result == s.length())
                    return result;
                result = 1;
            }

            
        }
        if(result == s.length())
            return result;
        return max;
    }
}

class TestarAlternatingString {

    public static void main(String[] args){
    
        System.out.println(new AlternatingString ().maxLength("000011110000"));
    }
}