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
public class FussySleeper  {
    
    public int[] nextTime(int[] currentTime, int elephants){
    
        String temp = "";
        int[] result = {0,0};
        for(int t: currentTime)
            temp += String.valueOf(t);
        int number = Integer.valueOf(temp);
        if(number == 0)
            return result;
        do{
        
            number++;
        }
        while(number % elephants != 0);
        
        result[0] = Integer.parseInt(String.valueOf(number).substring(0, 2));
        result[1] = Integer.parseInt(String.valueOf(number).substring(2, 4));
        return result;
    }
}

class TestaFussySleeper {

    public static void main(String[] args){
    
        int[] currentTime = {0,0};
        System.out.println(Arrays.toString(new FussySleeper().nextTime(currentTime, 999)));
    }
}