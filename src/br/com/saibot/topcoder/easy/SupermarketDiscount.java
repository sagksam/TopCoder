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
public class SupermarketDiscount{
    
    public int minAmount(int[] goods){   
        int total = 0;
        int menorCinque = 0;
        int count = 0;
        int countSeparate = 0;
        for(int i = 0; i < goods.length; i++){
        
            if(goods[i] >= 50)
                countSeparate++;        
            total += goods[i];
            
            if(goods[i] < 50){
                menorCinque += goods[i];
                count++;
            }    
        }
        int vezesDesconto = (goods.length - count) + 1;
        if(total < 50)
            return total;       
        if(countSeparate == 3)
            return total - 30;
        else
            return total - (vezesDesconto * 10);
    }
}

class TestaSupermarketDiscount{

    public static void main(String[] args){
    
        int[] goods = {50,62,93};
        System.out.println(new SupermarketDiscount().minAmount(goods));
    }
}