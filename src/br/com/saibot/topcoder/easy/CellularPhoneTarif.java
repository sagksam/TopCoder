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
public class CellularPhoneTarif {
    
    public int calculatePrice(int seconds){
    
        int minutes = 0;
        int result = 5;

        minutes = seconds / 60 + 1;

        
        for(int i = 1; i <= minutes; i++){
        
            if(i > 5)
                result += 3;
            else
                result += 10;
        }
        
        return result;
    }
}

class TestaCellularPhoneTarif{

    public static void main(String[] args){
    
        System.out.println(new CellularPhoneTarif().calculatePrice(240));
    }
}