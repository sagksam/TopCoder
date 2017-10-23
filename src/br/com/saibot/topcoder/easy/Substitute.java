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
public class Substitute {
    
    public int getValue(String key, String code){
    
        String result = "";
        for(int i = 0; i < code.length(); i++){
        
            String c = code.substring(i, i+1);
            int t = key.indexOf(c);
            if(t == key.length()-1)
                result += "0";
            if(t > 0 && t != key.length()-1)
                result += String.valueOf(t+1);
        }
        
        return Integer.parseInt(result);
    }
}

class TestaSubstitute{

    public static void main(String[] args){
    
        System.out.println(new Substitute().getValue("CRYSTALBUM", "MMA"));
    }
}