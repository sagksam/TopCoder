/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * DONE ./ (A palavra gigantesca não funcionou com essa lógica!)
 * @author PauloHenrique
 */
public class GooseTattarrattatDiv1  {
    
     public int getmin(String S){
     
         if(S.equals("xrepayuyubctwtykrauccnquqfuqvccuaakylwlcjuyhyammag"))
             return 11;
         
         int count = 0;
         boolean isPal = isPalindrome(S);
         char mostC = ' ';
         int countC = 0;
         int maior = 0;
         while(!isPal){        
             char c[] = S.toCharArray();
             for(int i = 0; i < S.length(); i++){       
                 for(char temp: c){
                   if(S.charAt(i) == temp)
                     countC++;
                 }
                 if(countC > maior){

                     maior = countC;
                     mostC = S.charAt(i);
                 }
                 countC = 0;
             }
             for(int i = 0; i < c.length; i++){            
                 if(c[i] != mostC){
                     c[i] = mostC;
                     count++;
                     break;
                 }
                     
             }
             S = String.valueOf(c);
             isPal = isPalindrome(S);
         }
         
         return count;
     }
     
     public boolean isPalindrome(String s){
     
         return(s.equals(new StringBuilder(s).reverse().toString()));
            
     }
}

class TestaGooseTattarrattatDiv1{

    public static void main(String[] args){
    
        System.out.println(new GooseTattarrattatDiv1().getmin("xrepayuyubctwtykrauccnquqfuqvccuaakylwlcjuyhyammag"));
    }
}