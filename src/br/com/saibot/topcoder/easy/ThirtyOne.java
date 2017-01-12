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
public class ThirtyOne {
    
    public int findWinner(String[] hands){
    
        double[] points = new double[hands.length];
        int point = 0;
        for(int i = 0; i < hands.length; i++){
        
            String[] c = hands[i].split(" ");
            if(equal(c))
                points[i] = 30.5;
            else{
              for(int j = 0; j < c.length; j++){
                        
                  if(c[j].equals("J") || c[j].equals("K") || c[j].equals("Q"))
                      point = 10;
                  else if(c[j].equals("A") && points[i]+11 > 31)
                      point = 1;
                  else if(c[j].equals("A") && points[i]+11 <= 31)
                      point = 11;
                  else
                      point = Integer.parseInt(c[j]);
                
                  points[i] += point;                
              }
            }  
        }
        
        double win = 100;
        int index = 0;
        for(int i = 0; i < points.length; i++){
        
            double temp = 31 - points[i];
            if(temp >= 0){
              if(temp < win){
                  win = temp;
                  index = i;
              }
            } 
        }
        System.out.println(index);
        return index;
    }
    
    public boolean equal(String[] array){
    
        for(int i = 0; i < array.length-1; i++){
        
            if(!array[i].equals(array[i+1]))
                return false;
        }
        return true;
    }
    
}


class TestaThirtyOne{

    public static void main(String[] args){
    
        String[] hands = {"Q K K", "10 J Q", "A 8 A", "2 2 2"};
        new ThirtyOne().findWinner(hands);
    }
}
