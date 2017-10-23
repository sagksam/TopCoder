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
public class AttendanceShort {
    
    public String[] shortList(String[]names, String[]attendance){
    
        String[] temp = new String[5]; 
        int count = 0;
        int countP = 0;
        for(int i = 0; i < names.length; i++){
                   
            for(int k = 0; k < attendance[i].length(); k++){
                
                char c = attendance[i].charAt(k);
                if(c == 'P'){
                    countP++;
                    count++;
                }    
                if(c == 'A')
                   count++;
            }

            double percentAttendance = (float) countP / count * 100;
            if(percentAttendance < 75)
                temp[i] = names[i];
            
            countP = 0;
            count = 0;
        
        }
        
        System.out.println(Arrays.toString(temp));
        int help = 0;
        for(String c: temp)
            if(c != null)
                help++;
        
        String result[] = new String[help];
        int j = 0;
        for(int i = 0; i < temp.length; i++){       
            if(temp[i]!= null){
                result[j] = temp[i];
                j++;
            }    
            
        }

        return result;
    
    }
}


class TestaAttendanceShort{

    public static void main(String[] args){

        String b[] = {};
        String c[] = {};      
        new AttendanceShort().shortList(b, c);
    }
}
