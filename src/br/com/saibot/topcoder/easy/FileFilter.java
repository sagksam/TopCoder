/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 *
 * @author PauloHenrique
 */
public class FileFilter {
    
     public String[] filter(String[] files, String[] extensions){
     
         String[] result = new String[files.length];
         if(files.length == 0)
             return result;
         for(int i = 0; i < result.length; i++)
             result[i] = "DENY";
         
         for(String ex: extensions){
             
             String temp = "."+ex;
            for(int i = 0; i < files.length; i++){
         
               if(files[i].toLowerCase().contains(temp)){
                 result[i] = "ALLOW";
                 break;
               }
           }
         }
         return result;
     }
}

class TestaFileFilter{

    public static void main(String[] args){
    
        String[] files = {".bashrc","bash.rc"};
        String[] filters = {"rc"};
        new FileFilter().filter(files, filters);
    }
}