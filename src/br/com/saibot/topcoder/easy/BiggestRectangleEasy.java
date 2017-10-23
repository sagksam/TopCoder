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
public class BiggestRectangleEasy {
    
    public int findArea(int N){
    
        int rest = N % 4;
        int div = N / 4;
        if(rest > 1){
        
            return (div + 1) * div;
        }
        else
            return div * div;
    }
}

class TestBiggestRectangleEasy{

    public static void main(String[] args){
    
        System.out.println(new BiggestRectangleEasy().findArea(11));
    }
}