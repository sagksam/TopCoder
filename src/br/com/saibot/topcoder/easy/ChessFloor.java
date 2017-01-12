/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 *
 * @author PauloHenrique
 */
public class ChessFloor {
    
    public  int minimumChanges(String[] floor){
    
        int count = 0;
        
        for(int i = 0; i < floor.length-1; i++){
        
            for(int j = 0; j < floor[i].length(); j++){
            
                if(floor[i].charAt(j) == floor[i+1].charAt(j)){
                    char[] temp = floor[i+1].toCharArray();
                    temp[j] = '*';
                    floor[i+1] = String.valueOf(temp);
                    count++; 
                }    
            }
        }
        
        return count;
    }
}

class TestaChessFloor{

    public static void main(String[] args){
    
        String[] floor = {"jecjxsengslsmeijrmcx", "tcfyhumjcvgkafhhffed", "icmgxrlalmhnwwdhqerc", "xzrhzbgjgabanfxgabed", "fpcooilmwqixfagfojjq", "xzrzztidmchxrvrsszii", "swnwnrchxujxsknuqdkg", "rnvzvcxrukeidojlakcy", "kbagitjdrxawtnykrivw", "towgkjctgelhpomvywyb", "ucgqrhqntqvncargnhhv", "mhvwsgvfqgfxktzobetn", "fabxcmzbbyblxxmjcaib", "wpiwnrdqdixharhjeqwt", "xfgulejzvfgvkkuyngdn", "kedsalkounuaudmyqggb", "gvleogefcsxfkyiraabn", "tssjsmhzozbcsqqbebqw", "ksbfjoirwlmnoyyqpbvm", "phzsdodppzfjjmzocnge"};
        System.out.println(new ChessFloor().minimumChanges(floor));
    }
}