/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class CollectingUsualPostmarks  {
    
    public int numberOfPostmarks(int[] prices, int[] have){
    
        if(prices.length == have.length)
            return prices.length;
        if(have.length == 0)
            return 0;
        List<Integer> noPost = new ArrayList<Integer>();
        int count = 0;
        List temp = Arrays.asList(have);
        for(int i = 0; i < prices.length; i++){
        
                if(!temp.contains(i)){
                  noPost.add(i);
            }     
        }
        int money = 0;
        for(int i = 0; i < have.length; i++){
        
            if(prices[have[i]] > money)
                money = prices[have[i]];
        }
        int result = have.length-1;
        for(int i = 0; i < noPost.size(); i++){
        
            if(prices[noPost.get(i)] <= money){           
                result++;
                money -= prices[noPost.get(i)];
            }
        }
        return result;
    }
}

class TestaCollectingUsualPostmarks {

    public static void main(String[] args){
    
        int[] prices = {4,13,9,1,5};
        int[] have = {1,3,2};
        new CollectingUsualPostmarks ().numberOfPostmarks(prices, have);
    }
}
