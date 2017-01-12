/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Scanner;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class DeleteChar {
    
    public String remove(String s, String deleteChar){ 
 
	 String restr = "";	    
	 
	 restr = s.replaceAll(deleteChar, "");
	
         return restr; 
         
    }
}

class TestaDeleteChar{

    public static void main(String[] args){
    
        System.out.println(new DeleteChar().remove("Hello World", "l"));
    }
}
