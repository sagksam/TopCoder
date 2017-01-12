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
public class RobotOnMoon  {
    
    public int longestSafeCommand(String[] board){
    
        int count = 0;
        boolean counTrue = false;
        if(board[0].length()==1)
            return 0;
        
        for(String t: board){
        
            for(int j = 0; j < t.length(); j++){
            
                if(t.charAt(j) == '#')
                    return -1;
                if(t.charAt(j) == 'S'){
                    counTrue = true;
                }
                if(t.charAt(j) == '.' && counTrue)
                    count++;
            }
        }
            
        
        return count;
    }
}

class TestaRobotOnMoon {

    public static void main(String[] args){
    
        String[] board = {"#.######", "#.#..S.#", "#.#.##.#", "#......#", "########"};
        
        System.out.println(new RobotOnMoon ().longestSafeCommand(board));
    }
}
