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
public class SoccerLeagues {
    
    public  int[] points(String[] matches){
    
        int[] result = new int[matches.length];
        for(int i = 0; i < matches.length; i++){
        
            for(int j = 0; j < matches[i].length(); j++){
            
                char c = matches[i].charAt(j);
                if(c == 'D'){
                    result[i] += 1;
                    result[j] += 1;
                }    
                if(c == 'W')
                   result[i] += 3;
                if(c == 'L')
                    result[j] += 3;
                
                System.out.println(i + " " + c + " " + j);


            }
        }
               
        return result;
    }
}

class TestaSoccerLeagues{

    public static void main(String[] args){
    
        String[] matches = {"-DWWD", "L-WLL", "DD-WD", "DDL-L", "DDLL-"};
        new SoccerLeagues().points(matches);
    }
}