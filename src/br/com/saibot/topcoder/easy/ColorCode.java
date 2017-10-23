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
public class ColorCode {
    
    public long getOhms(String[] code){
    
        String[]color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        String[]value = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[]multiplier = {"1", "0", "00", "000", "0000", "00000", "000000", "0000000", "00000000", "000000000"};
        String result = "";
        for (int i = 0; i < code.length; i++) {
            
            for (int j = 0; j < color.length; j++) {
                if (code[i].equals(color[j]) && i != 2) {
                    result = result + value[j];
                }
                if(code[i].equals(color[j]) && i == 2){
                    result = result + multiplier[j];
                }
            }
        }
        
        long temp = Long.parseLong(result);
        
        return temp;
    }
}

class TestaColorCode{

    public static void main(String[] args){
     
        String[] code = {"white", "white", "white"};
        System.out.println(new ColorCode().getOhms(code));
    }
}
