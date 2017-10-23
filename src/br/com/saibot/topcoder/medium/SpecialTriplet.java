/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

/**
 * DONE ./ (copiando algoritmo)
 * @author PauloHenrique
 */
public class SpecialTriplet {
    
    public double pythagorean(){
    
        int a = 0;
        int b = 0;
        double c = 0;
        double resp = 0;
        for(a = 3; a<=1000; a++){
        
            for(b = a+1; b <1000; b++){
            
                double temp = Math.pow(a, 2) + Math.pow(b, 2);
                c = Math.pow(temp, 0.5);
                
                if(a + b + c == 1000){
                    resp = a * b * c;
                }            
            }
        }
        
        return resp;
    }
}

class TestaSpecialTriplet{

    public static void main(String[] args){
    
        System.out.println(new SpecialTriplet().pythagorean());
    }
}