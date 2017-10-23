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
public class TheThe  {
    
    public int check(String[] lines){
    
        for(int i = 0; i < lines.length-1; i++){
        
            String[] c = lines[i].split(" ");
            String[] d = lines[i+1].split(" ");
            if(c[c.length-1].equals(d[0]))
                return i;
        }
        
        return -1;
    }
    
}

class TestaTheThe {

    public static void main(String[] args){
    
        String[] lines = {"I know that", "that kind of food", "is bad for me but", "I like it anyway"};
        System.out.println(new TheThe ().check(lines));
    }
}
