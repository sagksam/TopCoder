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
public class CardsShuffle{
 
       public String shuffle(String cards, int first, int last, int times){
      
        String temp = "";
        String temp2 = "";
        String result = "";
          for(int i = 0; i <times; i++){
            
             temp = cards.substring(first-1, last);
             
             if(first != 0 && last != cards.length())
                 temp2 = cards.substring(0, first-1) + cards.substring(last, cards.length());
             if(last == cards.length())
                 temp2 = cards.substring(0, first-1);
             
             cards = temp + temp2;
                 
              
          }

       return cards;
    
    }

}

class TestaCardsShuffle{

 
    public static void main(String[] args){
    
        new CardsShuffle().shuffle("NW", 2, 2, 9);
    }
}
