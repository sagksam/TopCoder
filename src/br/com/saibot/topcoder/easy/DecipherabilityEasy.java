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
public class DecipherabilityEasy  {
    
    public String check(String s, String t){
    
        String temp = "";
        if(s.length() - t.length() > 1)
            return "Impossible";
        try{
          for(int i = 0; i < s.length(); i++){
            
              if(s.charAt(i) != t.charAt(i)){
                 temp = t.substring(0, i) + s.charAt(i) + t.substring(i, t.length());
                  break;
              }    
           }
        }
        catch(Exception e){
        
            return "Impossible";
        }
        if(temp.equals(s))
            return "Possible";
        
        return "Impossible";
       
    }
}

class TestaDecipherabilityEasy {

    public static void main(String[] args){
    
        new DecipherabilityEasy ().check("singleroundmatch", "singeroundmatc");
    }
}