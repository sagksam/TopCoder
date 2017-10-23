/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

import java.util.Arrays;

/**
 *
 * @author PauloHenrique
 */
public class Archimedes{
    
    public double approximatePi(int n){
     
        return n * Math.sin(Math.PI / n);

    }   
}

class TestaArchimedes{

    public static void main(String[] args){
        
        System.out.print(new Archimedes().approximatePi(3));
    }
}