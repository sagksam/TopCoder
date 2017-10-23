/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 *
 * @author PauloHenrique
 */
public class Grader  {
    
    public int[] grade(int[] predictedGrades, int[] actualGrades){
    
        int result[] = new int[7];
        int dif = 0;
        for(int i = 0; i < predictedGrades.length; i++){
        
            if(predictedGrades[i] > actualGrades[i])
                dif = predictedGrades[i] - actualGrades[i];
            else
                dif = actualGrades[i] - predictedGrades[i];
            
            result[dif]++;
        }
        
        for (int i = 0; i < 7; i++) {
		result[i] = 100 * result[i] / predictedGrades.length;
	}
        
        return result;
    }
}

class TestaGrader {

    public static void main(String[] args){
    
        int[]predictedGrades = {1,5,7,3};
        int[]actualGrades = {3,5,4,5};
        new Grader ().grade(predictedGrades, actualGrades);
    }
}