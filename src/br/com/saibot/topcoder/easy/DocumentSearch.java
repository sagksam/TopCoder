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
public class DocumentSearch  {
    
    public int nonIntersecting(String[] doc, String search){
        String unique = "";
        int result = 0;
        for(String c: doc)
            unique += c;
        int ini = 0;
        int fin = search.length();
        while(ini < unique.length()){
            try{
              if(unique.substring(ini, fin).equals(search)){
            
                   ini += search.length();
                   fin += search.length();
                   result++;
              }
              else{
            
                  ini++;
                  fin++;
              }
            }
            catch(Exception e){
            
                break;
            }
        }
        
        return result;
    }
}

class TestarDocumentSearch {

    public static void main(String[] args){
    
        String[] doc = {"abcdefghijklmnop", "qrstuvwxyz"};
        System.out.println(new DocumentSearch ().nonIntersecting(doc, "pqrs"));
    }
}