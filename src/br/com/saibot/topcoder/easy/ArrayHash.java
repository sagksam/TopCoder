/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * You will be given a input. The value of each character in input is computed as follows:
 * All positions are 0-based. 'A' has alphabet position 0, 'B' has alphabet position 1, ... The returned hash is the sum of all character values in input. For example, if
 * then each character value would be computed as follows:
 * STATUS: DONE!!
 * @author PauloHenrique
 */
public class ArrayHash {
    
    public int getHash(String[] x){
    
        int alphabetPosition = 0;
        int elementInput = 0;
        int positionElement = 0;
        for(int j = 0; j < x.length; j++){
            String d = x[j];            
            char[] c = d.toCharArray();
            for(int i = 0; i < c.length; i++){
                
                switch(c[i]){
                    case 'A':
                        alphabetPosition = alphabetPosition + 0;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;
                    case 'B':
                        alphabetPosition = alphabetPosition + 1;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break; 
                    case 'C':
                        alphabetPosition = alphabetPosition + 2;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break; 
                    case 'D':
                        alphabetPosition = alphabetPosition + 3;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break; 
                    case 'E':
                        alphabetPosition = alphabetPosition + 4;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break; 
                    case 'F':
                        alphabetPosition = alphabetPosition + 5;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;
                    case 'G':
                        alphabetPosition = alphabetPosition + 6;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break; 
                    case 'J':
                        alphabetPosition = alphabetPosition + 7;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;     
                    case 'H':
                        alphabetPosition = alphabetPosition + 8;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break; 
                    case 'I':
                        alphabetPosition = alphabetPosition + 9;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;                 
                    case 'K':
                        alphabetPosition = alphabetPosition + 10;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break; 
                    case 'L':
                        alphabetPosition = alphabetPosition + 11;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;  
                    case 'M':
                        alphabetPosition = alphabetPosition + 12;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;   
                    case 'N':
                        alphabetPosition = alphabetPosition + 13;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;  
                    case 'O':
                        alphabetPosition = alphabetPosition + 14;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;   
                    case 'P':
                        alphabetPosition = alphabetPosition + 15;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;   
                    case 'Q':
                        alphabetPosition = alphabetPosition + 16;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break; 
                    case 'R':
                        alphabetPosition = alphabetPosition + 17;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;
                    case 'S':
                        alphabetPosition = alphabetPosition + 18;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;   
                    case 'T':
                        alphabetPosition = alphabetPosition + 19;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;
                    case 'U':
                        alphabetPosition = alphabetPosition + 20;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break; 
                    case 'V':
                        alphabetPosition = alphabetPosition + 21;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break; 
                    case 'W':
                        alphabetPosition = alphabetPosition + 22;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;  
                    case 'X':
                        alphabetPosition = alphabetPosition + 23;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;  
                    case 'Y':
                        alphabetPosition = alphabetPosition + 24;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break; 
                    case 'Z':
                        alphabetPosition = alphabetPosition + 25;
                        positionElement = positionElement + i;
                        elementInput = elementInput + j;
                    break;     
                        
                }
            }
        }
        
        
        return alphabetPosition + elementInput + positionElement;
    }
    
     
}

class TestaArrayHash{
    
    public static void main(String[] args){
        
        String[] y = {"CBA", "DDD"};
        
        int result = new ArrayHash().getHash(y);
        
        System.out.println(result);
    }
}
