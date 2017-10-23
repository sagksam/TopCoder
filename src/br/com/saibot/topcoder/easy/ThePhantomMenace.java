/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * FINALIZADO MAS COM ALGORITIMO COPIADO!!!
 * @author PauloHenrique
 */
public class ThePhantomMenace {
    
    public int find(int[] doors, int[] droids) {
    Arrays.sort(doors);
    Arrays.sort(droids);
    int maxSafety = 0;
    for (int door : doors) {
      int safety = 0;
      for (int i = 0; i < droids.length; i++) {
        if (droids[i] >= door) {
          if (i == 0) 
              safety = droids[i] - door;
          else 
              safety = Math.min(droids[i] - door, door - droids[i-1]);

          if (safety > maxSafety) 
              maxSafety = safety;
          break;
        }
      }
    }
    return maxSafety;
  }
}

class TestaPhantomMenace{
    
    public static void main(String[]args){
        
        int[] x = {2,3,5,7,11};
        int[] y = {1,8,13};
        
        System.out.println(new ThePhantomMenace().find(x, y));
    }
}
