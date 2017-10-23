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
public class MicroStrings  {
    
    public String makeMicroString (int A, int D){
    
        String c = String.valueOf(A);
        while(A >= 0){
            
            A = A - D;
            if(A >= 0)
            c += String.valueOf(A);
        }
        
        return c;
    }
            
}

class TestaMicroStrings {

    public static void main(String[] args){
    
        System.out.println(new MicroStrings ().makeMicroString(30, 6));
    }
}