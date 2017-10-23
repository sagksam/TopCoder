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
public class BoulderRace {
    
    public int winner(String[] boulders, int distance){
    
        int[] resultado = new int[boulders.length];
        int[] vezesPedraRolou = new int[boulders.length];
        int distanciaPercorrida = 0;    
        int rolagensPedra = 0;
        
           for(int j = 0; j < boulders.length; j++){
           
             while(distanciaPercorrida < distance){
             
                 int contador = 0;
                 
                 while(contador < boulders[j].length() && distanciaPercorrida < distance){
                 
                    char temp = boulders[j].charAt(contador);
                    distanciaPercorrida = distanciaPercorrida + Character.getNumericValue(temp);
                    rolagensPedra++;
                    contador++;
                 
                 }
         
             }

             resultado[j] = distanciaPercorrida;
             vezesPedraRolou[j] = rolagensPedra;
             distanciaPercorrida = 0;
             rolagensPedra = 0;
             
        }
               
           int menor = vezesPedraRolou[0];
           int indexRetorno = 0;
           for(int i = 0; i < resultado.length; i++){
               
               for(int l = 0; l < vezesPedraRolou.length; l++){

                   if(vezesPedraRolou[l] < menor){
                       menor = vezesPedraRolou[l];
                       indexRetorno = l;
                   }    
               
               }
           
           }          
           
           return indexRetorno;
    
    }
}

class TestaBoulderRace{

    public static void main(String[] args){
    
        String[] boulders = {"23", "1254", "81111", "3141"};
        
        new BoulderRace().winner(boulders, 24);
    }

}
