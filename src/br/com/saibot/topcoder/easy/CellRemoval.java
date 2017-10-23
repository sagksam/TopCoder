/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * DONE ./ (DEU ERRO ÚLTIMO TESTE)
 * @author PauloHenrique
 */
public class CellRemoval {
    
    public int cellsLeft(int[] parent, int deletedCell){
        int count = 0;
        
        if(deletedCell == 0)
            return 0;
        
        for(int i = 0; i < parent.length; i++){

            if(deletedCell != i && deletedCell != parent[i]){
            
                System.out.printf("%d:  %d\n", i, parent[i]);
                if(i > deletedCell)
                    count++;
                
            }
        }
        return count;
    }
}

class TestaCellRemoval{

    public static void main(String[] args){
    
        int[] parent = {26,2,32,36,40,19,43,24,30,13,21,14,24,21,19,4,30,10,44,12,7,32,17,43, 35,18,7,36,10,16,5,38,35,4,13,-1,16,26,1,12,2,5,18,40,1,17,38,44,14};
        
        System.out.println(new CellRemoval().cellsLeft(parent,24));
    }
}