/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class BlockTower {
    
    
    public int getTallest(int[] blockHeights){
      
        int sum = 0;
        int temp = 0;
        for(int i=0; i < blockHeights.length; i++){
        
            if(i == 0){
             sum = sum + blockHeights[0];
             temp = blockHeights[0];
            }
              
            
            if((i >0) && (!(blockHeights[i] % 2 == 0 && temp % 2 == 1)) && blockHeights[i] > blockHeights[i-1]){
              sum = sum + blockHeights[i];
            }            
        }
        
        return sum;
    }
}

class TestaBlackTower{

 public static void main(String[] args){
     int[] temp = {44,3,44,3,44,47,2,47,2,47,2};
     System.out.println(new BlockTower().getTallest(temp));
 }
}
