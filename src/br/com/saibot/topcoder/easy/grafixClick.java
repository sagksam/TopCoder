/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class grafixClick {
    
    public int[] checkSaveButton(int[]mouseRows, int[] mouseCols){
    
        int[] result = new int[100];
        for(int i = 0; i < mouseRows.length; i++){
        
            for(int j = 0; j < mouseCols.length; j++){
            
                if((mouseRows[i] >= 20 && mouseRows[i] <= 39) && (mouseCols[i] >= 50 && mouseCols[i] <= 99)){
                
                    if(i == 0)
                        result[i] = 100;
                    else{
                      result[i] = i;
                    }   
                }
            }
        }
        
        int count = 0;
        for(int i = 0; i < result.length; i++){
        
            if(result[i] > 0)
                count++;
        }
        
        int[] temp = new int[count];
        count = 0;
        for(int i = 0; i < result.length; i++){
        
            if(result[i] > 0){              
                    if(result[i] == 100){
                        temp[count] = 0;
                    }    
                    else if(result[i] != 100)
                      temp[count] = result[i];
                    
                    count++;
            }        
                
        }
        
        
        return temp;
    }
    
}

class TestaGrafixClick{

    public static void main(String[] args){
        int[] mouseRows = {20, 39, 100};
        int[] mouseCols =  {99, 50, 200};       
        new grafixClick().checkSaveButton(mouseRows, mouseCols);
    }
}