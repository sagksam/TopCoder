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
public class BrokenClock {
    
    public int fewestClicks(String clockTime, String currentTime){
        
        int hour;
        int minute;       
        int hourCurrentTime;
        int minuteCurrentTime;
        int pressButtonHour = 0;
        int pressButtonMinute = 0;
        
        //Configura a hora errada
        String temp = clockTime.substring(0, 2);
        hour = Integer.parseInt(temp);
        temp = "";
        temp = clockTime.substring(3, clockTime.length());
        minute = Integer.parseInt(temp);
        
        //Configura a hora correta
        temp = "";
        temp = currentTime.substring(0, 2);
        hourCurrentTime = Integer.parseInt(temp);
        temp = "";
        temp = currentTime.substring(3, clockTime.length());
        minuteCurrentTime = Integer.parseInt(temp);
        
        
        while(hour != hourCurrentTime){
              hour++;
              minute++;
              pressButtonHour++;
              if(hour == 24)
                  hour = 0;
              if(minute == 60)
                  minute = 0;
         }

        while(minute != minuteCurrentTime){
            
              minute++;
              pressButtonMinute++;
              if(minute == 60)
                  minute = 0;
        }

        return pressButtonHour + pressButtonMinute;
    }
}

class TestaBrokenClock{

    public static void main(String[] args){
    
        System.out.println(new BrokenClock().fewestClicks("18:43", "18:43"));
    
    }

}
