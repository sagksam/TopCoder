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
public class WhichDay {
    
    public String getDay(String[] notOnThisDay){
    
        String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int temp[] = new int[7];
        String result = "";
                
        for(int i = 0; i < dayOfWeek.length; i++){
        
            String day = dayOfWeek[i];
            
            for(int j = 0; j < notOnThisDay.length; j++){
            
                if(day.equals(notOnThisDay[j]))
                    temp[i] = 1;
            }
        }
        
        for(int i = 0; i < temp.length; i++){
        
            if(temp[i] == 0)
                result = dayOfWeek[i];
        }
        
        return result;
        
        
    }
}

class TestaWhichDay{

    public static void main(String[] args){
    
        String[] day = {"Sunday", "Friday", "Tuesday", "Wednesday", "Monday", "Saturday"};
        System.out.print(new WhichDay().getDay(day));
    }
}