/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author PauloHenrique
 */
public class ReverseStack {
    
    public String stringReverse(String s){
    
        Stack<Character> stack = new Stack<>();
        String result = "";
        for(int i = 0; i < s.length(); i++){
        
            char c = s.charAt(i);
            stack.push(c);
        }
        while(!stack.isEmpty()) {
          char d =  stack.pop();
          result += d;
        }
        
        return result;
    }
}

class TestaReverseStack{

    public static void main(String[] args){
    
        System.out.println(new ReverseStack().stringReverse("reverse"));
    }
}