/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * DONE ./ (Copiando algoritmo com mais de 3 em um array)
 * @author PauloHenrique
 */
public class DownloadingFiles  {
    
     public double actualTime(String[] tasks){
     
         int[] currentSpeed = new int[tasks.length];
         int[] remainingTime = new int[tasks.length];
         int newSpeed = 0;
         int oldRemainingTime = 0;
         int oldSpeed = 0;
         for(int i = 0; i < tasks.length; i++){
            int c = tasks[i].indexOf(" ");
            currentSpeed[i] = Integer.parseInt(tasks[i].substring(0, c));
            remainingTime[i] = Integer.parseInt(tasks[i].substring(c+1, tasks[i].length()));
         }
         
         if(remainingTime.length <= 2){
         
             int tempMenor = remainingTime[0];
             int tempMaior = 0;
             for(int i = 0; i < remainingTime.length; i++){
             
                 if(tempMenor > remainingTime[i])
                     tempMenor = remainingTime[i]; 
                 if(remainingTime[i] > tempMaior)
                     tempMaior = remainingTime[i];
                 if(currentSpeed[i] > oldSpeed)
                     oldSpeed = currentSpeed[i];
                 
                 newSpeed += currentSpeed[i];
             }
             
             oldRemainingTime = tempMaior - tempMenor;
             return (oldRemainingTime * oldSpeed/newSpeed) + tempMenor;
             
         }
         else{
             int speed = 0;
             int time = 0;
             int fileSize = 0;
             for( int i=0 ; i<tasks.length ; i++ ){
             String[] tmp = tasks[i].split(" ");
             speed += Integer.parseInt(tmp[0]);
             time += Integer.parseInt(tmp[1]);
             fileSize += Integer.parseInt(tmp[0]) * Integer.parseInt(tmp[1]);
         }
            return (double)fileSize/speed;
         }
     }
}

class TestaDownloadingFiles {

    public static void main(String[] args){
    
        String[] time = {"25 1000","5 5000","10 5000"};
        System.out.println(new DownloadingFiles ().actualTime(time));
    }
}
