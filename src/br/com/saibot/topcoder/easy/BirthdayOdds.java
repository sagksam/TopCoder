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
public class BirthdayOdds {
 
    public int minPeople(int minOdds, int daysInYear){
    
        double porcentagem = 0;
        int dividendo = daysInYear;
        double temp = 0;
        int count = 0;
        while(porcentagem < minOdds){
        
            if(count == 0)
                temp = (float) dividendo/daysInYear;
                    
            else
                temp = temp * (--dividendo / (double) daysInYear);
                        
            porcentagem = 100 - (temp * 100);
            count++;
            
        }
        
        return count;
    }
}

class TestaBirthdayOdds{
    
    public static void main(String[] args){
    
        System.out.println(new BirthdayOdds().minPeople(84, 9227));
    }
}
