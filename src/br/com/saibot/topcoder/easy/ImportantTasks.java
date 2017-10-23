/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class ImportantTasks {
    
    public int maximalCost(int[]complexity, int[]computers){
    
        int result = 0;
        Arrays.sort(computers);
        Arrays.sort(complexity);
        for(int c = 0; c < computers.length; c++){
        
            for(int j = 0; j < complexity.length; j++){
           
                if(computers[c] >= complexity[j]){
                    result++;
                    computers[c] = -50;
                    complexity[j] = 10000;
                    continue;
                }
                    
            }
        }
        return result;
    }
}

class TestaImportantTasks{

    public static void main(String[] args){
    
        int[]complexity = {100};
        int[]computers = {100,100};
        new ImportantTasks().maximalCost(complexity, computers);
    }
}