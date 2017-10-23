/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * DEON \./
 * @author PauloHenrique
 */
public class EllysTSP {
    
    public int getMax(String places){
    
        if(places.length() == 1)
            return 1;        
        int C = 0;
        int V = 0;
        String result;
        for(int i = 0; i < places.length(); i++){
        
            if(places.charAt(i) == 'C')
                C++;
            else
                V++;
        }
        if(V > C){
            result = "C";
            C--;
        }    
        else if(C > V){
            result = "V";
            V--;
        }
        else
            return 1;
        while(V >= 0 && C >= 0){

            if (result.charAt(result.length() - 1) == 'V') {
                result += 'C';
                C--;
            } else {
                result += 'V';
                V--;
            }       
         }
        return result.length();
    }
}

class TestEllysTSP{

    public static void main(String[] args){
    
          System.out.println(new EllysTSP().getMax("V"));
    }
}