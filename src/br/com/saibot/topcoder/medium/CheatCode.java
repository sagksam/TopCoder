/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class CheatCode {
    
    public int[]matches(String keyPresses, String[] codes){
    
        List<Integer> list = new ArrayList<Integer>();
        String comparar = "";
        String matches = "";
        for(int j = 0; j < keyPresses.length()-1; j++){               
            if(keyPresses.charAt(j) != keyPresses.charAt(j+1))
                comparar += keyPresses.charAt(j);               
        }
        
        comparar += keyPresses.charAt(keyPresses.length()-1);
        
        for(int i = 0; i < codes.length; i++){
        
            if(keyPresses.equals(codes[i]))
                list.add(i);
            else{            
                for(int j = 0; j < codes[i].length()-1; j++){               
                   if(codes[i].charAt(j) != codes[i].charAt(j+1))
                    matches += codes[i].charAt(j);               
                }
                
                matches += codes[i].charAt(codes[i].length()-1);
                if(comparar.contains(matches) || comparar.equals(matches))
                    list.add(i);
                
                matches = "";
                }
            }
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
            
        
        return result;
    }
}

class TestaCheatCode{

    public static void main(String[] args){
    
        String keyPresses = "AABBCCDDEEFFGGHHIIJJKKLLMMNNOOPPQQRRSSTTUUVVWWXXYY";
        String[] codes = {"ABCDE", "BCDEF", "CDEFG", "DEFGH", "EFGHI", "FGHIJ", "GHIJK", "HIJKL", "IJKLM", "JKLMN", "KLMNO", "LMNOP", "MNOPQ", "NOPQR", "OPQRS", "PQRST", "QRSTU", "RSTUV", "STUVW", "TUVWX", "UVWXY", "VWXYZ", "WXYZA", "XYZAB", "YZABC", "ZABCD"};
        
        new CheatCode().matches(keyPresses, codes);
    }
}
