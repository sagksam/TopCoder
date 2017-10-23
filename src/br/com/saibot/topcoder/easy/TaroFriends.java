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
public class TaroFriends  {
    
     int getNumber(int[] coordinates, int X){
    
         if(coordinates.length == 1)
             return 0;
         
         for(int i = 0; i < coordinates.length; i++){
         
             if(coordinates[i]< 0)
                 coordinates[i]+= X;
             else
                 coordinates[i]-= X;
         }
         int menor = 100;
         for(int i = 0; i < coordinates.length-1; i++){
         
             int result = (coordinates[i] - coordinates[i+1]);
             if(result >= 0 && result < menor)
                 menor = result;
         }
         return menor;
     }
}

class TestaTaroFriends {

    public static void main(String[] args){
    
        int[] coordinates = {3, 7, 4, 6, -10, 7, 10, 9, -5};
        System.out.println(new TaroFriends().getNumber(coordinates, 7));
    }
}