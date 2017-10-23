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
public class AlienAndPassword {
    
    int getNumber(String S){
    boolean temp = true;
    int count = 0;
        for(int i = 0; i < S.length()-1; i++){
        
            char c = S.charAt(i);
            char proximo = S.charAt(i+1);
            if(c == proximo)
                count++;
        }
        
        return S.length() - count;
    }
    
}

class TestaAlienAndPassword{

    public static void main(String[] args){
    
        System.out.print(new AlienAndPassword().getNumber("AGAAGAHHHHFTQLLAPUURQQRRRUFJJSBSZVJZZZ"));
    }
}
