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
public class HighScore {
    
    public int getRank(int[]scores, int newScore, int places){
    
        int count = 0;
        boolean indicaSaida = false;
        for(int i = 0; i < scores.length; i++){
            if(newScore >= scores[i] && newScore != scores[scores.length-1]){              
               indicaSaida = true;
               break;
            }   
            else
                count++;
        }
        
        if(count == 0)
            indicaSaida = true;
        
        if(!indicaSaida)
             return -1;
        
        return count +1;
    }
}

class TestaHighScore{

    public static void main(String[] args){
    
        int scores[] = {2000000000, 19539, 19466, 19146, 17441, 17002, 16348, 16343, 15981, 15346, 14748, 14594, 13752, 13684, 13336, 13290, 12939, 12208, 12163, 12133, 11621, 11119, 10872, 10710, 10390, 9934, 9296, 8844, 8662, 8653, 8168, 7914, 7529, 7354, 6016, 5428, 5302, 5158, 4853, 4538, 4328, 3443, 3222, 2107, 2107, 1337, 951, 586, 424, 31};
        System.out.print(new HighScore().getRank(scores, 1337, 50));
    }
}