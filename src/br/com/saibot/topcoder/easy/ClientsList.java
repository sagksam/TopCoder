/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class ClientsList  {
    
    public String[] dataCleanup(String[] names){
    
        String[] correctArray = new String[names.length];
        
        for(int i = 0; i < names.length; i++){
            String str = names[i];
            if(str.contains(",")){
                String[] temp = str.split(" ");
                str = temp[1] + " " + temp[0].substring(0, temp[0].length()-1);
            }
            correctArray[i] = str;
        }
        System.out.println(Arrays.toString(correctArray));
        Arrays.sort(correctArray, new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                String s1last = o1.split(" ")[1]; 
                String s2last = o2.split(" ")[1]; 
                if(!s1last.equals(s2last))
                  return s1last.compareTo(s2last); 
                else{
                  s1last = o1.split(" ")[0]; 
                  s2last = o2.split(" ")[0]; 
                  return s1last.compareTo(s2last);   
                }
            }        
            
        });
        System.out.println(Arrays.toString(correctArray));
        return correctArray;
    }
}

class TestaClientsList {

    public static void main(String[] args){
    
        String[] names = {"Trevor Alvarez", "Jackson, Walter", "Mandi Stuart", "Martin, Michael", "Peters, Tammy", "Richard Belmont", "Carl Thomas", "Ashton, Roger", "Jamie Martin"};
        new ClientsList ().dataCleanup(names);
    }
}