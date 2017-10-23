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
public class BrokenKeyboardRepair {
    
    public int minimalNumberOfKeys(String word){
    
        int result = 0;
        boolean[] arrayTemp = new boolean[word.length()];
        for(int i = 0; i < word.length(); i++){
          char c = word.charAt(i);
          int temp = word.lastIndexOf(Character.toString(c));
          if(temp >= 0)
              arrayTemp[temp] = true;
        }
        
        for(boolean c: arrayTemp)
            if(c)
                result++;

        return result;
    }
}

class TestaBrokenKeyboardRepair{

    public static void main(String[] args){
    
        System.out.println(new BrokenKeyboardRepair().minimalNumberOfKeys("abracadabra"));
    }
}