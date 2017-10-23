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
public class BinaryChange {
    
    public int correctNumber(String number){
            
        String[] array=number.split("(?<=\\G.{2})");
        String temp = "";
        int result = 0;
        for(String c: array){
        
            for(int i = c.length()-1; i >= 0; i--){
            
                temp += c.charAt(i);
            }
        }
        System.out.println(temp);
        int t = 0;
        for(int i = temp.length()-1; i >= 0; i--){
        
            int c = (int) Math.pow(2, t);
            t++;
            if(temp.charAt(i) == '1')
                result += c;
        }
        
        System.out.println(result);
        return result;
    }
}

class TestBinaryChange{

    public static void main(String[] args){
    
        new BinaryChange().correctNumber("00100101");
    }
}