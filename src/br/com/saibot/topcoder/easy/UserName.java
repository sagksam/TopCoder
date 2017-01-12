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
public class UserName {
    
    public String newMember(String[]existingNames, String newName){
    
        boolean isValid = false;
        int count = 1;
        String temp = newName;
        while(!isValid){
        
            for(int i = 0; i < existingNames.length; i++){
            
                if(!temp.equals(existingNames[i]))
                    isValid = true;
                if(temp.equals(existingNames[i])){                
                    isValid = false;
                    temp = newName + count;
                    break;
                }
                    
            }
            
            count++;
        }
        
        return temp;
    }
}

class TestaUserName{

    public static void main(String[] args){
    
        String[] existingNames = {"grokster2", "BrownEyedBoy", "Yoop", "BlueEyedGirl", "grokster", "Elemental", "NightShade", "Grokster1"};
        System.out.print(new UserName().newMember(existingNames, "grokster"));
        
    }
}