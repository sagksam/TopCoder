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
public class Chooser {
    
    public int numSets(int[]easy, int[]middle, int[]hard){
    
        int ajudaSoma = 0;
        
        if(easy.length == 0)
            return 0;
        
        for(int e = 0; e < easy.length; e++){
        
            for(int m = 0; m < middle.length; m++){
            
                for(int j = 0; j < hard.length; j++){
                
                    int temp = easy[e] + middle[m] + hard[j];
                    
                    if(temp < 60 || temp > 75)
                        ajudaSoma++;

                }
            }

        }
        
        int possibleSets = (easy.length * middle.length * hard.length);
        
        return (possibleSets - ajudaSoma);
    
    }
}

class TestaChooser{

    public static void main(String[] args){
    
        int easy[] = {5,5,5};
        int middle[] = {15,15,15};
        int hard[] = {45,45,35};
        System.out.print(new Chooser().numSets(easy, middle, hard));
    
    }

}