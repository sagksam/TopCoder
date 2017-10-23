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
public class Complaints  {
    
    public int howMany(int[] line){
        int count = 0;   
        boolean sorted = true;

        for (int i = 0; i < line.length - 1; i++) {
            if (line[i] < line[i+1]) {
              sorted = false;
              break;
            }
        }
        
        if(sorted)
            return 0;
        
        for(int i = line.length-1; i > 0 ; i--){
        
            int valor = line[i];
            for(int j = 0; j < line.length; j++){
                if(valor > line[j] && i > j){
                    count++;                      
                }    
            }
        }
        return count;
    }
    
}

class TestaComplaints {

    public static void main(String[] args){
    
        int[] line = {1000,0,4000,2000};
        System.out.println(new Complaints ().howMany(line));
    }
}