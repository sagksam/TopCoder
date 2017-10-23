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
public class StringCompare {
    
    public int simpleDifference(String a, String b){
    
        int count = 0;
        for(int i = 0; i < a.length(); i++){
            try{
              if(a.charAt(i) == b.charAt(i))
                count++;
              }
            catch(Exception e){}
        }
        return count;
    }
}

class TestaStringCompare{

    public static void main(String[] args){
    
        System.out.println(new StringCompare().simpleDifference("ANTIDISESTABLISHMENTARIANISM", "FLOCCIPAUCINIHILIPIFICATION"));
    }
}