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
public class BrickMystery {
    
    public String[] createPattern(String message){
    
        String[] result = new String[2 + message.length()];
        result[0] = "x.......x";
        result[result.length-1] = "x.......x";
        
        if(message.length() == 0)
            return result;            
        int count = 1;
        for(int i = 0; i < message.length(); i++){
        
            char c = message.charAt(i);
            int ascii = (int) c;
            result[count] = convertBinary(Integer.toBinaryString(ascii));
            count++;
        }
        
        return result;
    }
    
    public String convertBinary(String binary){
       
        System.out.println(binary.length());
        String result = "";
        if(binary.length() == 6)
          result = "x.";
        else
          result = "x";  
        for(int i = 0; i < binary.length(); i++){
        
            char c = binary.charAt(i);
            if(c == '1')
                result += 'x';
            else
                result += '.';
        }
        result += 'x';
        return result;
    }
}

class TestaBrickMystery {

    public static void main(String[] args){
    
        System.out.println(Arrays.toString(new BrickMystery().createPattern("P=NP?")));
    }
}