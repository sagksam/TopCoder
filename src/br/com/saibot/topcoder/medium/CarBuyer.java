/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

import java.util.Arrays;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class CarBuyer {
    
    public double lowestCost(String[] cars, int fuelPrice, int annualDistance, int years){
    
        double[] pricesCar = new double[cars.length];
        int priceCar = 0;
        int tax = 0;
        int fuelEficience = 0;
        double menor = 1000000;
        for (String car : cars) {
            String[] temp = car.split(" ");
            
            for(int i = 0; i < temp.length; i++){
            
                switch(i){
                 
                    case 0:
                        priceCar = Integer.parseInt(temp[i]);
                        break;
                    case 1:
                        tax = Integer.parseInt(temp[i]);
                    default:
                        fuelEficience = Integer.parseInt(temp[i]);
                }
            }
            
            int totalAnualDistance = annualDistance * years;
            int totalTax = tax * years;
            int fuel = (fuelPrice * totalAnualDistance) / fuelEficience;
            
            double total = totalTax + fuel + priceCar;
            
            if(total < menor)
                menor = total;

        }
        
        return menor;
    }
}

class TestaCarBuyer{

    public static void main(String[] args){
    
        String[] cars = {"8426 774 19","29709 325 31","30783 853 68","20796 781 3" ,"27726 4 81","20788 369 69","17554 359 34","12039 502 24" ,"6264 230 69","14151 420 65","25115 528 70","22234 719 55" ,"2050 926 40","18618 714 29","173 358 57"};
        System.out.println(new CarBuyer().lowestCost(cars, 33, 8673, 64));
    }
}