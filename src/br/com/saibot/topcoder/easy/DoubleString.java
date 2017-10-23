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
public class DoubleString  {
    
    public String check(String S){
    
        S = S.toLowerCase();
        
        if(S.length() % 2 != 0)
            return "not square";
        else{
        
            String t1 = S.substring(0, S.length()/2);
            String t2 = S.substring(S.length()/2, S.length());
            
            if(t1.equals(t2))
                return "square";
        }
        
        return "not square";
    }
}

class TestaDoubleString {

    public static void main(String[] args){
    
        System.out.println(new DoubleString ().check("ABCCBA"));
    }
}