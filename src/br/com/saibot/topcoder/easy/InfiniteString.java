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
public class InfiniteString  {
    
    public String equal(String s, String t){
        String t1 = s;
        if(s.length() <= t.length()){
        
            for(int i = 0; i < 6; i++){
                t1 += s;
            }
            
            if(t1.substring(0, t.length()).equals(t))
                return "Equal";
            else
                return "Not equal";
        }
        else{
            t1 = t;
            for(int i = 0; i < 6; i++){
                t1 += t;
            }
            
            if(t1.substring(0, s.length()).equals(s))
                return "Equal";
            else
                return "Not equal";
            
        }
    } 
}

class TestaInfiniteString  {

    public static void main(String[] args){
    
        System.out.println(new InfiniteString ().equal("abab", "aba"));
        
    }
}