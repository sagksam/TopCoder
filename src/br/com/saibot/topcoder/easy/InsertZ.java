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
public class InsertZ  {
    
    public String canTransform(String init, String goal){
        if(init.equals(goal))
            return "Yes";
        else{
            String temp = init + "z";
            for(int i = 0; i < temp.length(); i++){
            
                if(goal.indexOf(temp.charAt(i)) < 0)
                    return "No";
            }
        }
        
        return "Yes";
    }
}

class TestaInsertZ {

    public static void main(String[] args){
    
        System.out.println(new InsertZ ().canTransform("opdlfmvuicjsierjowdvnx", "zzopzdlfmvzuicjzzsizzeijzowvznxzz"));
    }   
}