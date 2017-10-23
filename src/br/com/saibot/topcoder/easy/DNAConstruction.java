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
public class DNAConstruction  {
    
  public int maxLength(String nucleotides){
  
      int result = 0;
      StringBuilder temp = new StringBuilder(nucleotides);
      for(int i = 0; i < temp.length(); i++){
       
          char x = temp.charAt(i); 
          for(int j = i; j < temp.length(); j++){
              char z = temp.charAt(j);
              if(x == 'G'){
                  
                  if(z == 'C'){
                  
                      result++;
                      temp.setCharAt(j, ' ');
                      
                  }                     
              }
              if(x == 'C'){
                  
                  if(z == 'G'){
                  
                      result++;
                      temp.setCharAt(j, ' ');
                      
                  }
              }
              if(x == 'T'){
                  
                  if(z == 'A'){
                  
                      result++;
                      temp.setCharAt(j, ' ');
                      
                  }
              }
              if(x == 'A'){
                  
                  if(z == 'T'){
                  
                      result++;
                      temp.setCharAt(j, ' ');
                      
                  }
              }
          }
      }
      return result;
  }
}


class TestaDNAConstruction {

    public static void main(String[] args){
    
        new DNAConstruction ().maxLength("AAAAAAAAAAAAAAAAACCCCCCCCGGGGGGGGTTTTTTTTTTTTTTTTT");
    }
}