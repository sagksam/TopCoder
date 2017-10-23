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

public class ReverseArray {
	
    public int[] showArray(int[] arr){
       
         int[] newArray = new int[arr.length];
         int count = 0;
         for(int i = arr.length-1; i >= 0; i--){
             newArray[count] = arr[i];
             count++;
         }

         return newArray;
         
    }
}

class TestaReverseArray{

    public static void main(String[] args){
    
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(new ReverseArray().showArray(arr)));
    }
}
