/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class OrderedNim {
    
    public String winner(int[] layout){
    
        int player = 0;
        boolean continua = true;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int c: layout)
            list.add(c);
                
        while(continua){
        
            for(int i = 0; i < list.size(); i++){
              if(list.size() == 2 && list.get(i) > list.get(1)){
                  
                  list.set(i, list.get(i)-1);
              }
              else{
                
                list.remove(i);
              }
              
              if(list.isEmpty())
                continua = false;
              
              player++;
          }
        }
        
        if(player % 2 == 0)
            return "Bob";
        else
            return "Alice";
        
    }
}

class TestaOrderedNim{

    public static void main(String[] args){
       
        int[]layout = {1,1,1,1};
        System.out.println(new OrderedNim().winner(layout));
    }
}