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
public class EsperantoNumbers  {
    
    public String nameThisNumber(int x){
    
        String[] numbers = {"","unu", "du", "tri", "kvar", "kvin", "ses", "sep", "ok", "nau", "dek"};
        
        if(x <= 10)
            return numbers[x];
        if(String.valueOf(x).charAt(1) == '0')
            return numbers[Character.getNumericValue(String.valueOf(x).charAt(0))] + "dek";        
        if(x > 10 && x < 20)     
            return "dek" + " " + numbers[Character.getNumericValue(String.valueOf(x).charAt(1))];
        return numbers[Character.getNumericValue(String.valueOf(x).charAt(0))] + "dek " + numbers[Character.getNumericValue(String.valueOf(x).charAt(1))];

    } 

}

class TestaEsperantoNumbers {

    public static void main(String[] args){
    
        System.out.println(new EsperantoNumbers().nameThisNumber(57));
       
    }
}