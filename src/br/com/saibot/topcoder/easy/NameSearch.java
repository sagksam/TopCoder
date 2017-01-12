/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * DONE./
 * @author PauloHenrique
 */
public class NameSearch {
     
    public String realName(String name, String names[], String[] surnames){
        
        String correctName = "";
          
          for(int i = 0; i <names.length; i++){
              
              if(name.equals(names[i]))
                correctName = name + " " + surnames[i];
          }
          
          return correctName;
         
    }
}

class TestaNameSearch{

    public static void main(String[] args){
        String surnames[]={"potter","jackson","smith","cruise","chan"};  
        String names[]={"harry","michael","will","tom","jackie"};
        new NameSearch().realName("harry", names, surnames);
    }
}

