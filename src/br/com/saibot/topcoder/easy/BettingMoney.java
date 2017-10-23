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
public class BettingMoney {
    
    
    public int moneyMade(int[] amounts, int[]centsPerDollar, int result){
    
    int gain = 0;
    int gainCompany = 0;
            
    for(int i=0; i < amounts.length; i++){
     
        if(i == result){
            gain = amounts[i] * centsPerDollar[i];
        }    
        else{
          gainCompany = gainCompany + amounts[i];
        }
    
    }

    int gainInCents = gainCompany * 100;
    
    return gainInCents - gain;
    }
}

class TestBettinMoney{

  public static void main(String[] args){
  
    int[] amounts = {100};
    int[] centsPerDollar = {10};
    int result = 0;
    System.out.println(new BettingMoney().moneyMade(amounts, centsPerDollar, result));
  }
}
