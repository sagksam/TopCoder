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
public class bloggoShortcuts {
    
    public String expand(String text){
    
        boolean countA = false;
        boolean countB = false;
        String result = "";
        for(int i = 0; i < text.length(); i++){
        
            char c = text.charAt(i);           
            if(c == '_' && countA == false){
                result = result + "<i>";
                countA = true;
            }    
            else if(c == '_' && countA == true){
                result = result + "</i>";
                countA = false;
            }    
            else if(c == '*' && countB == false){
                result = result + "<b>";
                countB = true;
            }    
            else if(c == '*' && countB == true){
                result = result + "</b>";
                countB = false;
            }
            else
              result = result + c;
            }          
        
        return result;
    }
}

class TestabloggoShortcuts{

    public static void main(String[] args){
    
        System.out.print(new bloggoShortcuts().expand(" _ _ __ _ yabba dabba _ * dooooo * ****"));
    }
}