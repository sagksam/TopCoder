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
public class RussianSpeedLimits {
    
    public int getCurrentLimit(String[] signs){
    
        int defaults = 60;
        try{
            return Integer.parseInt(signs[signs.length-1]);
        }    
        catch(Exception e){
            
            for (String sign : signs) {
                
                if(sign.equals("city")){
                
                    if(defaults == 60)
                        defaults = 90;
                    else
                        defaults = 60;
                }
            }
        }
        
        return defaults;
    } 
}

class TestaRussianSpeedLimits{

    public static void main(String[] args){
    
        String[] signs = {"40", "70", "default"};
        System.out.println(new RussianSpeedLimits().getCurrentLimit(signs));
    }
}
