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
public class EllysTimeMachine {
    
    public String getTime(String time){
    
        String[] HH = {"01","02","03","04","05","06","07","08","09","10","11","12"};
        String[] MM = {"05","10","15","20","25","30","35","40","45","50","55","00"};
        
        String hour = time.substring(0, 2);
        String minute = time.substring(3, 5);
        String newHour = "";
        String newMinute = "";
        for(int i = 0; i < HH.length; i++){
        
            if(HH[i].equals(hour))
                newMinute = MM[i];
        }
        
        for(int i = 0; i < MM.length; i++){
        
            if(MM[i].equals(minute))
                newHour = HH[i];
        }
        
        
        System.out.println(newHour);
        System.out.println(newMinute);
        
        return newHour + ":" + newMinute;
    }
}

class TestaEllysTimeMachine{

    public static void main(String[] args){
    
        System.out.println(new EllysTimeMachine().getTime("11:20"));
    }
}