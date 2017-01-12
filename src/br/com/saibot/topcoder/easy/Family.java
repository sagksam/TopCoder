/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * DONE ./ (quarto ex está errado)
 * @author PauloHenrique
 */
public class Family  {
    
    public String isFamily(int[] parent1, int[] parent2){
        boolean[] temp = new boolean[parent1.length];
        int p1 = 0;
        int p2 = 0;
        for(int i = 0; i < parent1.length; i++){
        
           p1 = parent1[i];
           p2 = parent2[i];
           
           for(int j = 0; j < parent1.length; j++){
           
               if(i != j && p1 >= 0 && p2 >= 0){
               
                   if(p1 == parent1[j] || p2 == parent1[j])
                       return "Impossible";
                   if(p1 == parent2[j] || p2 == parent1[j])
                       return "Impossible";
               }
           }
        }
        
        return "Possible";
    }
}

class TestaFamily{

    public static void main(String[] args){
    
        int[] parent1 = {-1,-1,-1,-1,1,-1,0,5,6,-1,0,3,8,6};
        int[] parent2 = {-1,-1,-1,-1,3,-1,4,6,5,-1,5,4,6,1};
        System.out.println(new Family().isFamily(parent1, parent2));
    }
}