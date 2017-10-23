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
public class AverageProblem  {
    
    public int numberOfParticipants(String[] marks){
    
        double sum = 0;
        boolean isInteger = false;
        int count = 1;
        int max = 0;
        if(marks.length == 1)
            return 1;
        else{
        
            for(String t: marks){
            
                while(!isInteger){ 
                    
                 if(Double.parseDouble(t) * ++count % 1 == 0)
                    isInteger = true;
               }
                
               if(count > max)
                   max = count;
               
               count = 0;
               isInteger = false;
            }
            
        }

        return max;
    }
}

class TestaAverageProblem {

    public static void main(String[] args){
    
        String[] marks = {"0.500","0.301"};
        System.out.println(new AverageProblem ().numberOfParticipants(marks));
    }
}
