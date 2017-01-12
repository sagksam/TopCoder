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
public class AimToTen {
    
    public int need(int[] marks){
    
        int quantidadeNotas = marks.length;
        int totalNotas = 0;
        double media = 0;
        int result = 0;
        for(int i = 0; i < marks.length; i++){
        
            totalNotas = totalNotas + marks[i];
        }
        
        media = (double) totalNotas / marks.length;
        
        if(media >= 9.5)
            return result;
        else{
        
            while(media < 9.5){
            
               totalNotas = totalNotas + 10;
               quantidadeNotas++;
               media = (double) totalNotas / quantidadeNotas;
               result++;
            }
        }
        
        return result;
    
    }
}

class TestaAimToTen{

    
    public static void main(String[] args){
    
        int[]marks = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(new AimToTen().need(marks));
    }
}
