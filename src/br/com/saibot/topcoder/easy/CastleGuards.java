/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 *
 * @author PauloHenrique
 */
public class CastleGuards {
    
    public int missing(String[] castle){
    
        int result = 0;
        for(String c: castle){
        
            if(!c.contains("X"))
                result++;
        }
        System.out.println(result);
        return result;        
    }
}

class TestCastleGuards{

    public static void main(String[] args){
    
        String[] castle = {"....XXXX", "........", "XX.X.XX.", "........", "........"};
        new CastleGuards().missing(castle);
    }
}