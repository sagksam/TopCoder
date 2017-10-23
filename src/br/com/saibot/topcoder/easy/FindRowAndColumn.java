/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * Exibe a linha e a coluna de um número escolhido
 * @author PauloHenrique
 */
public class FindRowAndColumn {
    
    public String rowAndColumn(int[][] array, int target){
    
        int row = 0;
        int column = 0;
        
        for(int i = 0; i < array.length; i++){
        
            for(int j = 0; j < array[i].length; j++){
            
                if(array[i][j] == target){
                    row = i;
                    column = j;
                }    
            }
        }
        return "Row  " + row + " " + " Column " + column ;
    }
}

class TestaFindRowAndColumn{

    public static void main(String[] args){
    
        int[][] array = {{7,8,1},{9,5,3,4,12}};
        System.out.println(new FindRowAndColumn().rowAndColumn(array, 4));
    }
}