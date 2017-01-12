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
public class CubeStickers {
    
    public String isPossible(String[] sticker){
    
        String[] array = new String[6];
        int count = 0;
        int index = 0;
        for (String sticker1 : sticker) {
            
            for(int i = 0; i < array.length; i++){
            
                if(sticker1.equals(array[i]))
                    count++;
            }
            if(count <= 1 && index < array.length){
               array[index] = sticker1;
               index++;
            }
            count = 0;
        }
       for(String c: array)
           if(c == null)
               return "NO";
       
       return "YES"; 
    }
}

class TestaCubeStickers {

    public static void main(String[] args){
    
        String[] sticker = {"white","gray","green","blue","yellow","red","target","admin"};
        System.out.println(new CubeStickers ().isPossible(sticker));
    }
}