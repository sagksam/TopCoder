/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 *
 * @author PauloHenrique
 */
public class HowYearsAndDays {
    
    public String countInt(int number){
    
        int years = number / 525600;
        int rest = number % 525600;
        int days = rest / 1440;
        return number + " minutes is approximately " + years + " and" + " days " + days;
    }
}

class TestaHowYearsAndDays{

    public static void main(String[] args){
    
        System.out.println(new HowYearsAndDays().countInt(3456789));
    }
}