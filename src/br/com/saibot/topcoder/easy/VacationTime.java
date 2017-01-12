/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * DONE ./ (Último teste ficou com bug)
 * @author PauloHenrique
 */
public class VacationTime {
    
    public int bestSchedule(int N, int K, int[] workingDays){
    
        int daysDelayed = N - K;
        int[] arrayCountRech = new int[daysDelayed+1];
        int count = 1;
        int c = 0;
        while(count <= arrayCountRech.length){        
            int countRech = 0;            
            for(int i = count; i <= N; i++){
            
                for(int j = 0; j < workingDays.length; j++){
                
                    if(i == workingDays[j])
                        countRech++;
                }
            }
            
            arrayCountRech[c++] = countRech;
            countRech = 0;
            count++;
        }
        Arrays.sort(arrayCountRech);
        return arrayCountRech[0];
    }
}

class TestaVacationTime{

    public static void main(String[] args){
    
        int[] workingDays = {808, 459, 792, 863, 715, 70, 336, 731};
        System.out.println(new VacationTime().bestSchedule(1000,513,workingDays));
    }
}