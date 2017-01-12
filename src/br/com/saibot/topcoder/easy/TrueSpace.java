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
public class TrueSpace {
    
    public long calculateSpace(int[]sizes, int clusterSize){
    
        long result = 0;
        
        for(int i = 0; i < sizes.length; i++){
        
            if(sizes[i] <= clusterSize && sizes[i] > 0)
                result = result + clusterSize;
            else{
                if(sizes[i] % clusterSize == 0){
                
                    int temp = sizes[i] / clusterSize;
                    result = result + temp * clusterSize;
                }
                else{
                  int temp = (sizes[i] / clusterSize) + 1;
                  result = result + temp * clusterSize;
                  
                }
            }
        }
        
        return result;
    }
}

class TestaTrueSpace{

    public static void main(String[] args){
    
        int[] sizes = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.print(new TrueSpace().calculateSpace(sizes, 8));
    }
}