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
public class BearSong {

    public int countRareNotes(int[] notes){
    
        int[] c = new int[1001];
        int result = 0;
        for(int i = 0; i < notes.length; i++){
        
            c[notes[i]] = c[notes[i]]+1;
        }
        
        for(int i = 0; i < c.length; i++){
        
            if(c[i] == 1)
                result++;
        }
        
        return result;
    
    }
}

class TestaBearSong{

    public static void main(String[] args){
    
        int[] notes = {1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000, 1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000, 1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000};
        System.out.print(new BearSong().countRareNotes(notes));
    
    }
}