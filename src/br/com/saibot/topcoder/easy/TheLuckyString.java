/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * DONE ./ (tem bug)
 * @author PauloHenrique
 */
public class TheLuckyString {
    
    static int result = 0;
    public int count(String s){
    
        TheLuckyString.permutation(s);
        return result;
    }
    
    public static void permutation(String str) { 
      permutation("", str); 
    }

    private static void permutation(String prefix, String str) {
      int n = str.length();
      if (n == 0){ 
         result += verifica(prefix);
 
      }    
      else {
          for (int i = 0; i < n; i++)
              permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
      }
    }
    
    public static int verifica(String prefix){
    
        boolean isLucky = true;
        for(int i = 0; i < prefix.length()-1; i++){
        
            char c = prefix.charAt(i);
            char t = prefix.charAt(i+1);
            if(c == t)
                isLucky = false;
        }
        if(isLucky)
            return 1;
        
        return 0;
    }
    
}

class TestaTheLuckyString {

    public static void main(String[] args){
    
        System.out.println(new TheLuckyString ().count("aabbbaa"));
    }
}