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
public class DNASequence {
    
    public int longestDNASequence(String sequence){
    
        char[] dna = {'A', 'C', 'G', 'T'};
        int[] sequenceDNA = new int[sequence.length()];
        String stringTemp = "";
        int maior = sequenceDNA[0];
        for(int i = 0; i < sequence.length(); i++){
        
           char temp = sequence.charAt(i);
           
           int index = Arrays.binarySearch(dna, temp);
             
           if(index >= 0){
               System.out.println(temp);
               stringTemp = stringTemp + temp;
           }
           else{
               sequenceDNA[i] = stringTemp.length();
               stringTemp = "";
           }
           if(stringTemp.length() == sequence.length())
               sequenceDNA[i] = stringTemp.length();
        
        }
        
        for(int i: sequenceDNA){
          if(i > maior)
              maior = i;
        
        }
        
    return maior;
    
    }
}

class TestaDNASequence{

    public static void main(String[] args){
      
        new DNASequence().longestDNASequence("TOPBOATER");
    
    }
}