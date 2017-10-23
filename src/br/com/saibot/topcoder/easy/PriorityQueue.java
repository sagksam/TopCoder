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
public class PriorityQueue {
    
    public int findAnnoyance(String S, int[] a){
    
        int sum = 0;
        for(int i = 0; i < S.length(); i++){
        
            for(int j = i+1; j < S.length(); j++){
            
                if(S.charAt(j) == 'b')
                    sum += a[i];
            }
        }
        return sum;
    }
}

class TestaPriorityQueue{

    public static void main(String[] args){
    
        int[] a = {58,517,301,524,79,375,641,152,810,778,222,342,911,313,336};
        new PriorityQueue().findAnnoyance("bbeebeebeeeebbb", a);
    }
}