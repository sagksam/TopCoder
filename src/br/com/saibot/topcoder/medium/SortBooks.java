/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

import java.util.Arrays;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class SortBooks {
    
    public int[] checkManually(String[] field1, String[] field2){
    
        boolean[] countSort = new boolean[field1.length];
        int[] marca1Array = new int[4];
        int[] marca2Array = new int[4];
        for(int i = 0; i < countSort.length; i++){
        
            countSort[i] = false;
        }
        
        for(int i = 0; i < field1.length; i++){
        
            String marca1 = field1[i].toLowerCase();
            String marca2 = field2[i].toLowerCase();
            
            String[] string = marca1.split(" ");
            boolean checaMarca1 = true;
            for(String temp: string){
            
                if(temp.equals("the"))
                    checaMarca1 = false;
                if(temp.equals("and"))
                    checaMarca1 = false;
                if(temp.equals("of"))
                    checaMarca1 = false;
                        
            }
            
            int indexMarca1 = field1[i].split(" ").length;
            if(indexMarca1 > 3)
                checaMarca1 = false;
            
            String[] string2 = marca2.split(" ");
            boolean checaMarca2 = true;
            for(String temp: string2){
            
                if(temp.equals("the"))
                    checaMarca2 = false;
                if(temp.equals("and"))
                    checaMarca2 = false;
                if(temp.equals("of"))
                    checaMarca2 = false;
                        
            }
            
            int indexMarca2 = field2[i].split(" ").length;
            if(indexMarca2 > 3)
                checaMarca2 = false;
       
            if(checaMarca1 && checaMarca2)
                countSort[i] = true;
            else if(!checaMarca1 && !checaMarca2)
                countSort[i] = true;
            
        }
        
        
        int countTrue = 0;
        
        for(boolean c: countSort){
            if(c)
                countTrue++;
        }
        
        
        int[]result = new int[countTrue];
        int count = 0;
        for(int i = 0; i < countSort.length; i++){
        
            if(countSort[i]){
                result[count] = i;
                count++;
            }    
          
        }
        
        return result;
    }

}

class TestaSortBooks{

    public static void main(String[] args){
        String[] autor = { "Lost Horizon" };
        String[] livros = { "James Hilton" };
        System.out.println(Arrays.toString(new SortBooks().checkManually(autor, livros)));
    }
}