/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * Verifica se uma dentro de um array existe uma sublista
 * @author PauloHenrique
 */
public class Sublist {

    public boolean isSublist(int[]array1, int[]array2){
    
        for(int i = 0; i < array1.length; i++){
        
            for(int j = 0; j < array2.length; j++){
            
                if(array1[i] == array2[j])
                    return true;
            }
        }
        
        return false;
    }
}

class TestaSublist{

    public static void main(String[] args){
    
        int[] array1 = {};
        int[] array2 = {1,2,3,4,5};
        
        System.out.println(new Sublist().isSublist(array1, array2));
    }
}