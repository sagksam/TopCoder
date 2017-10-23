/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class PingPongQueue {
    
    public int[] whoPlaysNext(int[] skills, int N, int K){
    
        int[] result = new int[2];
        int[] matchesWon = new int[skills.length];
        int countMatches = 1;
        Queue queue = new LinkedList();
        for(int i = 0; i < skills.length; i++)
            queue.add(skills[i]);
        int player1 = (int) queue.remove();
        int player2 = (int) queue.remove();
        while(countMatches < K){
        
            if(player1 > player2){
              queue.add(player2);
              player2 = (int) queue.remove();
              if(countWins(skills, matchesWon, player1) == N){
                  queue.add(player1);
                  player1 = (int) queue.remove();
              }    
            }  
            else{
                queue.add(player1);
                player1 = (int) queue.remove();
                if(countWins(skills, matchesWon, player2) == N){
                  queue.add(player2);
                  player2 = (int) queue.remove();
              }   
            }
            countMatches++;
        }
        if(player1 < player2){
            result[0] = player1;
            result[1] = player2;
        }    
        else{
            result[0] = player2;
            result[1] = player1;
        } 
        return result;
    }
    
    public int countWins(int[] skills, int[]matchesWon, int player){
    
        int c = 0;
        for(int i = 0; i < skills.length; i++){
        
            if(skills[i] == player){
                c = i; 
                matchesWon[i] = matchesWon[i] +1;
            }    
        }
        return matchesWon[c];
    }
}

class TestaPingPongQueue{

    public static void main(String[] args){
    
        int[] skills = {49, 24, 26, 12, 5, 33, 25, 30, 35, 41, 46, 23, 21, 3, 38, 43, 11, 19, 34, 29, 20, 32, 39, 7, 50};       
        new PingPongQueue().whoPlaysNext(skills, 10, 399);
    }
}