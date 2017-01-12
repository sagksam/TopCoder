/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * ERRADO!!!!!!!
 * @author PauloHenrique
 */
public class EllysSubstringSorter  {
    
    public String getMin(String S, int L){
    
        String temp = "";
        String result = "";
        temp = S.substring(0, L);
        String rest = S.substring(L, S.length());
        char[] c = temp.toCharArray();
        Arrays.sort(c);
        for(char t: c)
           result += t;
        
        return result + rest;
    }
}

class  TestaEllysSubstringSorter{

    public static void main(String[] args){
    
        System.out.println(new EllysSubstringSorter ().getMin("ESPRIT", 3));
    }
}