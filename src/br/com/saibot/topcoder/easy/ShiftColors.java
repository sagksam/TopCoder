/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 *
 * @author PauloHenrique
 */
public class ShiftColors {
    
    public String maxShifts(String word, int[] arrayShift){
    
        String result = "";
        for(int i = 0; i < arrayShift.length; i++){
        
            result += word.charAt(arrayShift[i]);
        }
        
        return result;
    }
}

class TestaShiftColors{

    public static void main(String[] args){        
        int[] array = {0,1,5,8,9};
        
        System.out.println(new ShiftColors().maxShifts("WWWWWWWWWBBWB", array));
    }
}