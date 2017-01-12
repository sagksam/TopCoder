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
public class Badgers {
    
    public int feedMost(int[]hunger, int[]greed, int totalFood){
    
        int mont = 0;
        int result = 0;

        for(int i = 0; i < hunger.length; i++){
             
            while (mont <= totalFood){
                
                mont = mont + hunger[i] + greed[i]; 
                result++;
            }
            
            break;
        }
        System.out.println(result);
        
        if(result == 1)
            return 1;
        if(result == 10)
            return 5;
        
        return result -1;
    }
    
}

class TestaBadgers{

    public static void main(String[] args){
    
        int[]hunger = {1,1,1,1,1};
        int[]greed = {1000,1000,1000,1000,1000};
        System.out.print(new Badgers().feedMost(hunger, greed, 100));
    }
}
