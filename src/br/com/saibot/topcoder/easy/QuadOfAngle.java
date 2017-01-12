/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Scanner;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class QuadOfAngle {
    
   public int quadrant(int angle){

      int quadrant;

      quadrant = (angle/90)%4+1;

      return quadrant;
     
   }
}

class TestaQuadOfAngle{

    public static void main(String[] args){
    
        System.out.println(new QuadOfAngle().quadrant(3));
    }
}
