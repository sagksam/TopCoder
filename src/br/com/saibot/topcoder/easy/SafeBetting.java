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
public class SafeBetting  {
    
    public int minRounds(int a, int b, int c){
    
        int bet = 0;
        int money = 0;
       
        while(b < c){
            if(b - money == a){
                money = b - a;
                b +=  money;
                bet++;
            }
            if(b - money > a){          
                money++;
            }    
        }
        return bet;
    }
}

class TestaSafeBetting {

    public static void main(String[] args){
    
        new SafeBetting ().minRounds(5, 7, 22);
    }
}