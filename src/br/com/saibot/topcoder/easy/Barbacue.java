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
public class Barbacue {
    
    public int eliminate(int n, int[] voter, int[] excluded){
    
        int[] temp = new int[n];
        int max = 0;
        int index = 0;
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < excluded.length; j++){
            
                if(i == excluded[j])
                    temp[i]++;
            }
        }
        
        System.out.println(Arrays.toString(temp));

        for(int i = 0; i < temp.length; i++){
        
            if(temp[i] > max){
                max = temp[i];
                index = i;
            }    
        }
        int c = 0;
        for(int i=0; i < temp.length; i++){
        
            if(temp[i] == max)
                c++;
                
        }
        if(c >= 2){
        
            ArrayList<Integer> lista = new ArrayList<Integer>();
            for(int i = 0; i < temp.length; i++)
               if(temp[i] == max)
                    lista.add(i);
            int[] arrayPro = new int[lista.size()];
            for(int j=0; j < lista.size(); j++){
         
                for(int i = 0; i < voter.length; i++){
                
                    if(lista.get(j) == voter[i])
                        arrayPro[j] = arrayPro[j] +1;
                }
            }
            
            System.out.println(Arrays.toString(arrayPro));
            int max2 = 0;
            boolean bre = false;
            for(int i = 0; i < arrayPro.length-1; i++){
            
                if(arrayPro[i] != arrayPro[i])
                      bre = true;
   
            }
            if(bre)
                return 1;
            for(int i = 0; i < arrayPro.length; i++){
            
                if(arrayPro[i] > max2)
                    max2 = arrayPro[i];
   
            }
            
            return lista.get(max2);
        }
        else
            return temp[index];
        
    }
}

class TestaBarbacue{

    public static void main(String[] args){
    
        int[] voter = {1,2,3,4,5,6,0,2,3,4,5,6,0,1,3,4,5,6,0,1,2, 4,5,6,0,1,2,3,5,6,0,1,2,3,4,6,0,1,2,3,4,5};
        int[] excluded = {0,0,0,0,0,0,1,1,1,1,1,1,2,2,2,2,2,2,3,3,3, 3,3,3,4,4,4,4,4,4,5,5,5,5,5,5,6,6,6,6,6,6};
        System.out.println(new Barbacue().eliminate(7, voter, excluded));
    }
}