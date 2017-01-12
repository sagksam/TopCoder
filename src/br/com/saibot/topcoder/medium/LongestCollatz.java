/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class LongestCollatz {
    
    public long sequence(){
    
        long sequenceLength = 0;
        long startingNumber = 0;
        long sequence;
 
        for (int i = 2; i <= 1000000; i++) {
        int length = 1;
        sequence = i;
        while (sequence != 1) {
          if ((sequence % 2) == 0) {
              sequence = sequence / 2;
          } else {
              sequence = sequence * 3 + 1;
          }
          length++;
        }
 
        //Check if sequence is the best solution
         if (length > sequenceLength) {
           sequenceLength = length;
           startingNumber = i;
         }
        }

            return startingNumber;
    }
}

class TestaLongestCollatz{

    public static void main(String[] args){
    
        System.out.println(new LongestCollatz().sequence());
    }
}