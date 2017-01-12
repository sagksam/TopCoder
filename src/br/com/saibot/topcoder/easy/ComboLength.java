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
public class ComboLength  {
    
    public int howLong(String moves){
        
        int countC = 0;
        int max = 0;
        for(int i = 0; i < moves.length(); i++){
            try{
                
                if(moves.charAt(i) == moves.charAt(i+1))
                    countC++;
                else{
                
                    if(countC > max){  
                        max = countC;
                    }
                    countC=0;
                }
            }
            catch(Exception e){
            }
        }
        
        if(max == 0)
            return countC +1;
        else
            return max +1;
    }
}

class TestaComboLength {

    public static void main(String[] args){
    
        System.out.println(new ComboLength ().howLong("AAA"));
    }
}