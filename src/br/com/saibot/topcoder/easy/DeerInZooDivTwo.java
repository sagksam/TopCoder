/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * Brus and Gogo came to the zoo today. It's the season when deer shed their antlers. 
 * There are N deer in the zoo. Initially, each deer had exactly two antlers, but since then some deer may have lost one or both antlers. 
 * (Now there may be some deer with two antlers, some with one, and some with no antlers at all.) 
 * Brus and Gogo went through the deer enclosure and they collected all the antlers already lost by the deer. 
 * The deer have lost exactly K antlers in total. Brus and Gogo are now trying to calculate how many deer have not lost any antlers yet. 
 * Return a with exactly two elements {x,y}, where x is the smallest possible number of deer that still have two antlers, and y is the largest possible number of those deer.
 * STATUS: DONE!!
 * @author PauloHenrique
 */
public class DeerInZooDivTwo {
    
    public int[] getminmax(int N, int K){
        
        int menorNumero;
        int maiorNumero;
        int[]resultado = new int[2];
        
        if((N <= K) && (K % 2 != 0)){
            menorNumero = 0;
            int temp = (K - 1) / 2 + 1;
            maiorNumero = N - temp;
            resultado[0] = menorNumero;
            resultado[1] = maiorNumero;

        }
        else{
            menorNumero = 0;
            int temp = (K / 2);
            maiorNumero = N - temp;
            resultado[0] = menorNumero;
            resultado[1] = maiorNumero;

        }
        if(K == 0){
            menorNumero = N;
            maiorNumero = N;
            resultado[0] = menorNumero;
            resultado[1] = maiorNumero;

        }
        if(K % 2 == 0){
            int temp = K / 2;
            maiorNumero = N - temp;
            menorNumero = N - K;
            resultado[0] = menorNumero;
            resultado[1] = maiorNumero;
        }
        
        if((K % 2 != 0) && (N > K)){
            
            int temp = K / 2;
            maiorNumero = (N - temp) -1;
            menorNumero = (N - K);
            resultado[0] = menorNumero;
            resultado[1] = maiorNumero;

        }
        
        
        return resultado;
    }
}

class TestaDeerInZooDivTwo{
    
    public static void main(String[] args){
         
        int[] resultado = new DeerInZooDivTwo().getminmax(100, 193);
        
        for(int t: resultado)
            System.out.println(t);
    }
}