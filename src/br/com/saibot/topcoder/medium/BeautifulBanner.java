/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

/**
 * DONE ./ (corrigir bug do c)
 * @author PauloHenrique
 */
public class BeautifulBanner {
    
    public int maximumBeauty(String letters, int[] beauty){
    
        char[] c = {'T','e','c','h','O','l','y','m','p','i','c','s'}; 
        char[] newC = letters.toCharArray();
        int cout = 0;
        for(char chr: c){
          for(int i = 0; i < newC.length; i++){
        
             if(chr == newC[i])
                 cout++;
          }
          if(cout == 0)
              return -1;
          if(chr == 'c' && cout < 2)
              return -1;
          
          cout = 0;
        }
        int sum = 0;
        if(c.length == newC.length){
        
            for(int i = 0; i < beauty.length; i++)
                sum+= beauty[i];
        }
        else{
        
            for(char chr: c){
              int maior = 0; 
              int temp = 0;
              for(int i = 0; i < newC.length; i++){
                  if(chr == newC[i]){
                      if(beauty[i] >= maior)
                          maior = beauty[i];                          
                  }
              }
              sum += maior;
            }  
        }
        
        return sum;
            
    }
}

class TestaBeautifulBanner{
 
    public static void main(String[] args){
    
        String letters = "mcspypseseilmhTOOiciTys";
        int[] beauty = {68,69,9,45,66,50,11,41,42,54,21,61,74,2,62,40,1,3,49,21,2,54,50};
        
        System.out.println(new BeautifulBanner().maximumBeauty(letters, beauty));
        
    }
}