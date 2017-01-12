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
public class TennisSet{
    
    public String firstSet(String[] points){
    
        String player = "Player A";
        String game = "";
        int playerA = 0;
        int playerB = 0;
        int countPointsA = 0;
        int countPointsB = 0;
        for(String string: points)
            game += string;
        
        for(int i = 0; i < game.length(); i++){
        
            char won = game.charAt(i);
            if(player.equals("Player A")){
            
                if(won == 'S'){           
                    countPointsA++;
                }    
                else
                    countPointsB++;
                
                if(countPointsA >= 4 && countPointsA - countPointsB >= 2){             
                    playerA++;
                    player = "Player B";
                    countPointsA = 0;
                    countPointsB = 0;
                }
                if(countPointsB >= 4 && countPointsB - countPointsA >= 2){             
                    playerB++;
                    player = "Player B";
                    countPointsA = 0;
                    countPointsB = 0;
                }
            }
            else{
                
                if(won == 'S'){
                    countPointsB++;
                }    
                else
                    countPointsA++;
                
                if(countPointsB >= 4 && countPointsB - countPointsA >= 2){           
                    playerB++;
                    player = "Player A";
                    countPointsA = 0;
                    countPointsB = 0;

                }
                if(countPointsA >= 4 && countPointsA - countPointsB >= 2){           
                    playerA++;
                    player = "Player A";
                    countPointsA = 0;
                    countPointsB = 0;
                }
            }
            
            if(playerA == 6 || playerB == 6)
                break;     
        }
        
        return playerA+"-"+playerB;
        
    }
}

class TestaTennisSet{

    public static void main(String[] args){
    
        String[] points = {"SS","SRSS","RRRRR"};
        System.out.print(new TennisSet().firstSet(points));
    }
}