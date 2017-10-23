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
public class TaroString  {
    
    public String getAnswer(String S){
    
        if(S.length() == 3 && !S.equals("CAT"))
            return "";
        for(int i = 0; i < S.length(); i++){
        
            if(S.charAt(i) != 'C' && S.charAt(i) != 'A' && S.charAt(i) != 'T'){
            
                S = S.replace(S.charAt(i), ' ');
            }
                
        }
        String result = S.replaceAll(" ", "");
        if(result.equals("CAT"))
            return "POSSIBLE";
        else
            return "IMPOSSIBLE";
      
    }
}

class TestaTaroString {

    public static void main(String[] args){
    
        System.out.println(new TaroString().getAnswer("XCYAZTX"));
    }
}