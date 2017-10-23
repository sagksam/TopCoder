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
public class FizzBuzz {
    
    public String fizzBuzz(Integer i ){
    
        if(i % 3 == 0 && i % 5 == 0)
            return "FizzBuzz";
        if(i % 3 == 0)
            return "Fizz";
        if(i % 5 == 0)
            return "Buzz";
        else
            return i.toString();
    }
}

class TestaFizzBuzz{

    public static void main(String[] args){
    
        System.out.println(new FizzBuzz().fizzBuzz(2));
    }
}