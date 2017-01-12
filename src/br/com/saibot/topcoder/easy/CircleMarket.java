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
public class CircleMarket  {
    
    public int makePurchases(int[] openTime, int[] closeTime, int travelTime){
    
        int countSecond = 0; 
        int finalTime = 0;
        int countVisit = 0;
        int[] arrayVisit = new int[openTime.length];
        for(int i = 0; i < closeTime.length; i++){
        
            if(closeTime[i] > finalTime)
                finalTime = closeTime[i];
        }
        
        while(countSecond <= finalTime){
          for(int i = 0; i < openTime.length; i++){
        
              if(countSecond >= openTime[i] && countSecond <= closeTime[i])
                  arrayVisit[i]++;
              
              countSecond += travelTime;
          }
        }
        for(int i = 0; i < arrayVisit.length; i++){
        
            if(arrayVisit[i] > 0)
                countVisit++;
        }
        
        return countVisit;
    }
}

class TestaTeste{

    public static void main(String[] args){
    
        int[] openTime = {0, 0, 0};
        int[] closeTime = {100, 100, 100};
        System.out.println(new CircleMarket().makePurchases(openTime, closeTime, 3));
    }
}