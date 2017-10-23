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
public class Chivalry {
    
    public String getOrder(String first, String second){
    
        String result = "";
        String men = "";
        String women = "";
        char temp = first.charAt(0);
        char temp2 = second.charAt(0);
        
        if(temp == 'M' && temp2 == 'M'){
            result = result + temp + first.charAt(1);
            result = result + second.substring(0, second.length());
            return result;
        }
        else{
        
            for(int i = 0; i < first.length(); i++){
            
                char c = first.charAt(i);
                if(c == 'M')
                    men = men + c;
                if(c == 'W')
                    women = women + c;
            }
            for(int i = 0; i < second.length(); i++){
                char c = second.charAt(i);
                if(c == 'M')
                    men = men + c;
                if(c == 'W')
                    women = women + c;
                                   
            }
            
            result = women + men;
            return result;
            
        }
    }
}

class TestaChivarly{

    public static void main(String[] args){
    
        System.out.println(new Chivalry().getOrder("M", "WWW"));
    }
}
