/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * In many computer systems and networks, different users are granted different levels of access to different resources. 
 * In this case, you are given a rights, indicating the privilege level of each user to use some system resource. 
 * You are also given a minPermission, which is the minimum permission a user must have to use this resource.
 * STATUS: DONE!!
 * @author PauloHenrique
 */
public class AccessLevel {
    
    public String canAccess(int[] rights, int minPermision){
        
        String result = "";
        
        for(int i = 0; i < rights.length; i++){
            
            if(rights[i] < minPermision){
                result = result + "D";
            }
            else{
                
                result = result + "A";
            }
        }
        
        return result;
    }
}

class TestaAcessLevel{
    
    public static void main(String[] args){
        
        int temp[] = {};
        new AccessLevel().canAccess(temp, 49);
    }
}