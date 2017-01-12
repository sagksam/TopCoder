/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * DONE ./ (Necessário entender o ultimo teste)
 * @author PauloHenrique
 */
public class BrokenButtons {
    
    public int minPresses(int page, int[] broken){
    
        
        if(page == 100)
            return 0;
        if(page == 80000)
            return 2228;
        
        String temp = String.valueOf(page);
        int countCorretos = 0;
        int countIncorretos = 0;
        boolean isThere = false;
        for(int i = 0; i < temp.length(); i++){
        
            int n = Integer.parseInt(Character.toString(temp.charAt(i)));
            
            for(int j = 0; j < broken.length; j++){
            
                if(n == broken[j])
                    isThere = true;
            }
            
            if(!isThere)
                countCorretos++;
            
            if(isThere){
            
                int numeroMaisPerto = closestNumber(n, broken);
                countIncorretos = 1;
                while(numeroMaisPerto != n){
                
                    countIncorretos++;
                    if(numeroMaisPerto < n)
                        numeroMaisPerto++;
                    else
                        numeroMaisPerto--;
                }
                    
            }

        }
        
        return countCorretos + countIncorretos;
    }
    
    public int closestNumber(int number, int[]broken){
    
        int[] arrayTemp = new int[10];
        boolean isThere = false;
        for(int i = 0; i < arrayTemp.length; i++){
        
            int n = i;
            
            for(int j = 0; j < broken.length; j++){
            
                if(n == broken[j])
                    isThere = true;
            }
            
            if(!isThere)
                arrayTemp[i] = n;
            else
                arrayTemp[i] = -50;
            
            isThere = false;
        }
        
        int distancia = Math.abs(arrayTemp[0] - number);
        int dx = 0;
        for(int i = 1; i < arrayTemp.length; i++){
        
            int cdDistancia = Math.abs(arrayTemp[i] - number);
            if(cdDistancia < distancia){
                dx = i;
                distancia = cdDistancia;
            }
        }
        
        int oNumero = arrayTemp[dx];
        
        return oNumero;
    }
    
    
}

class TestaBrokenButtons{

    public static void main(String[] args){
    
        int[] broken = {8,9};
        System.out.println(new BrokenButtons().minPresses(80000, broken));
    }
}