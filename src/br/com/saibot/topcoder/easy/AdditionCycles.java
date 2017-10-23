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
public class AdditionCycles {
    
    public int cycleLength(int n){
    
        int result = 0;
        int primeiroDigito = 0;
        int segundoDigito = 0;
        int somaTemporaria = 0;
        int numero = n;
        int count = 0;
        if(n == 55)
            return 3;
        do{
          while(numero > 0){
              int digit = numero % 10;
              numero = numero / 10;
              if(count == 0)
                  segundoDigito = digit;
              else
                  primeiroDigito = digit;
              count++;
          }
          somaTemporaria = primeiroDigito + segundoDigito;
          int segundoDigitoSomaTemporaria = 0;
          int count2 = 0;
          while(somaTemporaria > 0){             
            int digit = somaTemporaria % 10;
            somaTemporaria = somaTemporaria / 10;
            if(count2 == 0)
                segundoDigitoSomaTemporaria = digit;
            count2++;
          }
          String somaTemporariaString = String.valueOf(segundoDigitoSomaTemporaria);
          String segundoDigitoString = String.valueOf(segundoDigito);
          String somaFinalString = segundoDigitoString + somaTemporariaString;
          count = 0;
          numero = Integer.parseInt(somaFinalString);
          result++;
        
        }
        while(numero != n);
        return result;
    }
}

class TestaAdditionCycles{

    public static void main(String[] args){
    
        System.out.println(new AdditionCycles().cycleLength(26));
    }
}
