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
public class Soccer {
    
    public int maxPoints(int[] wins, int[]ties){
    
        int[] points = new int[wins.length];
        
        for(int i = 0; i < wins.length; i++){
        
            points[i] = wins[i] * 3 + ties[i];
        }
        
        int max = 0;
        for(int i = 0; i < points.length; i++){
        
            if(points[i] > max)
                max = points[i]; 
        }
        
        return max;
    }
}

class TestaSoccer{

    public static void main(String[] args){
   
        int[] wins = {1,4,3,0,0};
        int[] ties = {3,1,5,3,1};
        
        System.out.print(new Soccer().maxPoints(wins, ties));
        
    }

}