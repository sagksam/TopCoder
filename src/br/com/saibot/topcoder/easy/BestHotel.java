/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * DONE (último errado) 
 * @author PauloHenrique
 */
public class BestHotel  {
    
    public int numberOfDisadvantageous(int[] price, int[] quality){
    
        int count = 0;
        
        for(int i = 0; i < price.length-1; i++){
        
            if(price[i] <= price[i+1] && quality[i] >= quality[i+1])
                count++;

        }
        return count;
    }

}

class TestaBestHotel {

    public static void main(String[] args){
    
        int[] price = {200,300,100,500,100,100,200};
        int[] quality = {7,7,4,8,4,3,6};
        
        new BestHotel().numberOfDisadvantageous(price, quality);
    }
}