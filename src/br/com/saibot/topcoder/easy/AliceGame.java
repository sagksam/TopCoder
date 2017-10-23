/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * Alice and Kirito just played a game. The game consisted of a finite (possibly empty) sequence of turns. 
 * You do not know the exact number of turns. The turns were numbered starting from 1. In each turn, exactly one of our two players won. 
 * The winner of turn i scored 2*i-1 points.
 * You are given two s x and y. Find out whether it is possible that at the end of the game Alice had exactly x points and Kirito had exactly y points. 
 * If it is possible, return the smallest number of turns Alice could have won. If the given final result is not possible, return -1 instead.
 * STATUS: DONE!!
 * @author PauloHenrique
 */
public class AliceGame {
    
    public long findMinimumValue(long x, long y){
        
        long totalPontosAcumulados = x + y;
        long totalRodadasJogadas = (long) Math.sqrt(totalPontosAcumulados);
        long minimoJogadas = 1;
        
        if(totalRodadasJogadas * totalRodadasJogadas != totalPontosAcumulados)
            return -1;       
        if(x == 2)
            return -1;
        if(x == 0)
            return 0;
        else{
          for(int i = 1; i<= x; i++){
            
            x = x-(2 * totalRodadasJogadas-1);
            totalRodadasJogadas = (totalRodadasJogadas-1);
            minimoJogadas = minimoJogadas + 1;
              
          }
        }  
        return minimoJogadas;
        
    }    

}

class TestaAliceGame{
    
    public static void main(String[] args){
        
        System.out.println(new AliceGame().findMinimumValue(0, 0));
    }
}

