/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class WallRepair  {
    
    public int bricksRequired(String[] wallRows){
    
        if(wallRows.length == 1)
            return 0;
        
        int count = 0;
        for (int i = 0; i < wallRows.length; i++) {
            for (int j = 0; j < wallRows[i].length(); j++) {
                
                char c = wallRows[i].charAt(j);
                
                if(c == 'X'){
                
                    for(int k = i+1; k < wallRows.length; k++){
                    
                        if(wallRows[k].charAt(j)== '.'){
                        
                            StringBuilder replace = new StringBuilder(wallRows[k]);
                            replace.setCharAt(j, 'X');
                            wallRows[k] = replace.toString();
                            ++count;
                        }
                    }
                }
            }
        }
        return count;
    }    
}

class TestaWallRepair{

    public static void main(String[] args){
    
        String[] wallRows = {"..X...X.....", "....X.X...XX", "...........X", "..X.......X."};
        
        new WallRepair().bricksRequired(wallRows);
    }
}
