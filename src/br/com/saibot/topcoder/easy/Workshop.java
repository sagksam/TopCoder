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
public class Workshop  {
    
    public int pictureFrames(int[] pieces){
    
        int a=0;
        int b=0;
        int c=0;
        int count = 0;
        for(int i = 0; i < pieces.length; i++){
        
            a = pieces[i];
            
            for(int j = i+1; j < pieces.length; j++){
            
                b = pieces[j];
                
                for(int k = j+1; k < pieces.length; k++){
                
                    c = pieces[k];
                    if(isTriangle(a,b,c))
                        count++;
                }
                
            }
        }
        return count;
    }
    
    public boolean isTriangle(int side1, int side2, int side3) {
		return ((side1 > 0) &&
				(side2 > 0) &&
				(side3 > 0) &&
				(side1 + side2 > side3) &&
				(side1 + side3 > side2) &&
				(side2 + side3 > side1));
    }
}

class TestaWorkshop {

    public static void main(String[] args){
    
        int pieces[] = {100};
        new Workshop ().pictureFrames(pieces);
    }
}