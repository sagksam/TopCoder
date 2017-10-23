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
public class YoungBrother  {

    public String[] restoreWords(String[] lines, int n, int k){
    
        String[] result = new String[n];
        String temp = "";
        for (String line : lines)
            if(!line.equals(""))
                temp += line;
        
        for(int i = 0; i < result.length; i++){
        
            result[i] = temp.substring(0, k);
            temp = temp.substring(k);
        }
        return result;
    }    
}

class TestaYoungBrother {

    public static void main(String[] args){
    
        String[] lines = {"","","","","vhtoqhthisojnovivdavhafa","wjbjtwwxuglxceeypnnvkuxwolaycvrwtdaugej","",""};
        new YoungBrother ().restoreWords (lines,3,21);
    }
}