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
public class AzimuthMonitoring {
 
    public int getAzimuth(String[] instructions){
    
        int result = 0;
      
        for(int i = 0; i < instructions.length; i++){
        
            String c = instructions[i];
            int degree = 0;
            if(c.equals("HALT"))
                break;
            if(c.contains("LEFT") && c.length() > 4){
            
                degree = Integer.parseInt(c.substring(5, c.length()));
                c = "LEFT2";              
            }
            if(c.contains("RIGHT") && c.length() > 5){
            
                degree = Integer.parseInt(c.substring(6, c.length()));
                c = "RIGHT2";
            }
            switch(c){
             
                case "LEFT":
                    result -= 90; 
                    if(result < 0)
                        result += 360;
                    break;
                case "RIGHT":
                    result += 90;
                    if(result > 360)
                        result -= 360;
                    break;
                case "TURN AROUND":
                    result += 180;
                    if(result > 360)
                        result -= result - 360;
                    break;
                case "LEFT2":
                    result -=  degree; 
                    if(result < 0)
                        result += 360;
                    break;
                case "RIGHT2":
                    result += degree;
                    if(result > 360)
                        result -= 360;
                    break;
                    
            }
        }
        if(result == 360)
            result = 0;
        return result;
    }
}

class TestAzimuthMonitoring{

    public static void main(String[] args){
    
        String[] instructions = {"LEFT", "LEFT", "LEFT", "LEFT", "LEFT", "HALT"};
        System.out.println(new AzimuthMonitoring().getAzimuth(instructions));
    }
}