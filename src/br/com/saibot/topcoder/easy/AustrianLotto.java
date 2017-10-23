/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * In the Austrian Lotto "6 aus 45" (6 out of 45), six distinct numbers between 1 and 45, inclusive, are selected as the winning numbers in a drawing. 
 * Prior to the drawing, lotto players pick six distinct numbers from the same range. 
 * The number of matches between their numbers and the winning numbers determines the prize that they win. 
 * An addicted gambler who plays multiple times in a single drawing faces a lot of work when comparing all of his picks to the winning numbers. 
 * Given a drawing, the result of the current drawing, and a picks, the picks made by a gambler, return a which represents a breakdown of the gambler's success rate. 
 * The should contain exactly seven elements. The 0th element is the number of picks in which there are no matches between the gambler's numbers and the drawn numbers, and the 1st to 6th elements are the number of picks in which there are 1 to 6 matches, respectively. drawing and each element of picks contains exactly 6 distinct integers between 1 and 45, inclusive, each separated by a single space, e.g. "3 12 13 17 32 45" (quotes for clarity).
 * STATUS: DONE!!
 * @author PauloHenrique
 */
public class AustrianLotto {
    
    public int[] evaluate(String drawing, String[] picks){
                
        int[] arrayDrawingInt = returnDrawing(drawing);
        int[] arrayPicksInt = returnPicks(picks);
        int[] arrayContaDuplicidades = {0, 0, 0, 0, 0, 0, 0};
        int cont = 0;
        int cont2 = 0;
        int numeroArraysPicks = 0;
        int quantidadeNumerosIguais = 0;        
        int numerosDiferentes = 0;
        int quantidadeNumerosDiferentes = 0;
        
        for(int l = 0; l < arrayPicksInt.length; l++){
            
            if(arrayPicksInt[l] != 0){
                cont2++;
            }
        }
        
        numeroArraysPicks = cont2 / 6;
        
        for(int i = 0; i < arrayDrawingInt.length; i++){
            
            for(int j = 0; j < arrayPicksInt.length; j++){
                
                if(arrayDrawingInt[i] == arrayPicksInt[j]){
                    System.out.println(arrayPicksInt[j]);
                    cont++;
                    
                }
            }
        }
        
        if(cont2 > 6){
         try{
             quantidadeNumerosIguais = cont / 2;
             numerosDiferentes = cont2 - quantidadeNumerosIguais;
             arrayContaDuplicidades[numeroArraysPicks - 1] = quantidadeNumerosIguais;
             for(int k = 0; k <=numerosDiferentes; k=k+6){
            
              System.out.println("k +" + k);
              quantidadeNumerosDiferentes++;
            }
             arrayContaDuplicidades[0] = quantidadeNumerosDiferentes - quantidadeNumerosIguais;
         }
         catch(Exception e){
             quantidadeNumerosIguais = 0;
         }
        }
        else{
            quantidadeNumerosIguais = cont;
            numerosDiferentes = cont2 - quantidadeNumerosIguais;
            arrayContaDuplicidades[quantidadeNumerosIguais] = numeroArraysPicks;
            if(numerosDiferentes == 6)
                arrayContaDuplicidades[1] = quantidadeNumerosDiferentes - quantidadeNumerosIguais;
        }
        
        
        
        return arrayContaDuplicidades;
    }
    
    public int[] returnDrawing(String drawing){
        
        int[] drawingInt = new int[6];
        int cont = 0;        
        String[] arrayDrawing = drawing.split(" ");
        for(String palavra: arrayDrawing){
            
            try{
                drawingInt[cont++] = Integer.parseInt(palavra);
            }
            catch(Exception e){
                
            }
        }
        
        return drawingInt;
    }
    
    
    public int[] returnPicks(String[] arrayString){
         
        
        int[] numeros = new int[18];      
        int i = 0;
        
        for(String palavra: arrayString){
            try{
                
                String[] temp = palavra.split(" ");
                for(String t: temp){
                  numeros[i++] = Integer.parseInt(t);
                }              
            }
            catch(NumberFormatException e){

            }
        }
        
        
        return numeros;
    }
}

class TestaAustrianLotto{
    
    public static void main(String[] args){
        
        String[] j = {"13 4 36 42 26 12"};
        new AustrianLotto().evaluate("1 2 3 6 7 8", j);
    }
}
