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
public class OneDimensionalRobotEasy  {
    
    public int finalPosition(String commands, int A, int B){
    
        int x = 0;
        int temp = A - (A * 2);
        for(int i = 0; i < commands.length(); i++){
        
            char c = commands.charAt(i);
            if(c == 'L' && x > temp)
                x--;
            if(c == 'R' && x < B)
                x++;
            
        }
        return x;
    }
}

class TestaOneDimensionalRobotEasy {

    public static void main(String[] args){
        
        new OneDimensionalRobotEasy ().finalPosition("RRRRRRRLRRLRRRRRRRRRRRRLRLRRRRRRRRLRRRRRLRRRRRRRRR", 5, 20);
    }
}