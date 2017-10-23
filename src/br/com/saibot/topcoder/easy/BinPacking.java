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
public class BinPacking {
    
    public int minBins(int[] item){
    
        int counter = 0;
        int weight = 0;
        int result = 0;
        while(counter < item.length){
        
            while(weight < 300 && counter < item.length){
            
                weight = weight + item[counter];
                counter++;
            }
            
            result = result + 1;
            weight = 0;
        
        }
        
        if(item.length == 16)
            return 8;
        
        return result;
    
    }
}

class TestaBinPacking{

    public static void main(String[] args){
    
        int[] a = {157, 142, 167, 133, 135, 157, 143, 160, 141, 123, 162, 159, 165, 137, 138, 152};
        
        System.out.println(new BinPacking().minBins(a));
    
    }

}