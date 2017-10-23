/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.HashSet;

/**
 * DONE ./.\
 * @author PauloHenrique
 */
public class ToolsBox {
    
    public int countTools(String[] need){
    
        HashSet<String> set = new HashSet<String>(); 
        String temp = "";
        for(String c: need){
        
            for(int i = 0; i < c.length(); i++){
            
                char t = c.charAt(i);
                if(t != ' '){
                    temp += t;
                    
                }
                else{
                    System.out.println(temp);
                    set.add(temp);
                    temp = "";
                }
            }
            set.add(temp);
            temp = "";
        }
        
        return set.size();
        
    }
}

class TestaToolsBox{

    public static void main(String[] args){
    
        String[] need = {"SAW","SAW"};
        new ToolsBox().countTools(need);
    }
}