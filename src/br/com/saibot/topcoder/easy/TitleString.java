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
public class TitleString  {
    
    public String toFirstUpperCase(String title){
    
        if(title.equals(""))
            return " ";
        String[] temp = title.split(" ");
        String t = "";
        String result = "";
        for(int i = 0; i < temp.length; i++){
        
            if(!temp[i].equals(""))
               t = temp[i].substring(0, 1).toUpperCase() + temp[i].substring(1);
            if(i < temp.length-1)
              result += t + " ";
            if(i == temp.length-1)
                result += t;

        }
        return result;
    }
}

class TestaTitleString {

    public static void main(String[] args){
    
        System.out.println(new TitleString ().toFirstUpperCase(" lord of the rings the fellowship of the ring "));
    }
}