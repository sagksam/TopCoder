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
public class Arrows  {
    
    public int longestArrow(String s){
    
        int count = 0;
        int max = -1;
        if(!s.contains("=") || !s.contains("-"))
            return 1;
        if(!s.contains(">") || !s.contains("<"))
            return -1;
        else{            
                if(s.contains(">") && s.contains("<")){
                    count = 1;
                     if(count > max)
                        max = count;
                }    
                if(s.contains("<-")){
                    for(int i=s.indexOf("<-"); i < s.length(); i++){
                    
                        char c = s.charAt(i);
                        if(c == '-')
                          count++;
                        else
                            break;
                    }
                    if(count > max)
                        max = count;
                    count = 1;
                }
                if(s.contains("<=")){
                    for(int i=s.indexOf("<="); i < s.length(); i++){
                    
                        char c = s.charAt(i);
                        if(c == '=')
                          count++;
                        else
                            break;
                    }
                    if(count > max)
                        max = count;
                    count = 1;
                }
                if(s.contains("->")){
                    for(int i=s.indexOf("->"); i >= 0; i--){
                    
                        char c = s.charAt(i);
                        if(c == '-')
                          count++;
                        else
                            break;
                    }
                    if(count > max)
                        max = count;
                    count = 1;
                }
                if(s.contains("=>")){
                    for(int i=s.indexOf("=>"); i >= 0; i--){
                    
                        char c = s.charAt(i);
                        if(c == '=')
                          count++;
                        else
                            break;
                    }
                    if(count > max)
                        max = count;
                    count = 1;
                }
        }            
        return max;
    }
}

class TestaArrows {

   public static void main(String[] args){
   
       System.out.println(new Arrows().longestArrow("<----=====>"));
   }
}