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
public class CountryGroupHard  {
 
    public String solve(int[] a){
    
        boolean[] temp = new boolean[a.length];
        int count = 0;
        for(int i = 0; i < a.length; i++)
            if(a[i] > 0){ 
                temp[i] = true;
                count += a[i];
            }
        for(int i = 0; i < a.length; i++){
        
            if(a[i] > 0 && temp[i] == true){
            
                try{
                  if(a[i-1] == 0){
                      a[i-1] = a[i];
                      temp[i-1] = true;
                  }
                  if(a[i+1] == 0){
                     a[i+1] = a[i]; 
                     temp[i+1] = true;
                  }   
                }
                catch(Exception e){
                }
            }
        }
        for(int i = 0; i < a.length; i++)
            if(a[i] == 0)
                return "Insufficient";
        
        if(a.length <= count)
            return "Sufficient";
        else
            return "Insufficient";

    }
}

class TestaCountryGroupHard {

    public static void main(String[] args){
    
        int[] a = {0,2,3,0,0};
        System.out.println(new CountryGroupHard ().solve(a));
    }
}