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
public class AddMultiply {
    
    public int[] makeExpression(int y){
    
        int x1;
        int x2;
        int x3;
        int[] result = new int[3];
        for(x1 = -1000; x1 <= 1000; x1++){
        
            for(x2 = -1000; x2 <= 1000; x2++){
            
                for(x3 = -1000; x3 <= 1000; x3++){
                
                    if(x1 != 0 && x1 != 1 && x2 != 0 && x2 != 1 && x3 != 0 && x3 != 1){
                    
                        if((x1 * x2) + x3 == y){
                           result[0] = x1;
                           result[1] = x2;
                           result[2] = x3;
                        }
                    }
                }
            }
        }
        
        return result;
    }
    
}

class TestaAddMultiply{

    public static void main(String[] args){
    
        System.out.println(Arrays.toString(new AddMultiply().makeExpression(6)));
    }
}