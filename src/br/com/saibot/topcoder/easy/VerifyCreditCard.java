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
public class VerifyCreditCard {
    
    public String checkDigits(String cardNumber){
    
        boolean isEven = true;
        String tempCard = "0" + cardNumber;
        String newCard = "";
        int t = tempCard.length()-1;
        
        if(t % 2 != 0){
            isEven = false;
        }
       
                
        for(int i = 1; i < tempCard.length(); i++){
        
            if(isEven == false){
            
                if(i % 2 == 0){
                
                    char c = tempCard.charAt(i);
                    int temp = Character.getNumericValue(c) * 2;
                    newCard = newCard + String.valueOf(temp);
                }
                else{
                
                    char c = tempCard.charAt(i);
                    newCard = newCard + c;
                }
            }
            if(isEven == true){
            
                if(i % 2 != 0){
                
                    char c = tempCard.charAt(i);
                    System.out.println(c);
                    int temp = Character.getNumericValue(c) * 2;
                    newCard = newCard + String.valueOf(temp);
                }
                else{
                
                    char c = tempCard.charAt(i);
                    newCard = newCard + c;
                }
            }
            
        }

        int somaCard = 0;
        for(int i = 0; i < newCard.length(); i++){
        
            char c = newCard.charAt(i);
            somaCard += Character.getNumericValue(c);
        }

        if(somaCard % 10 == 0){
        
            return "VALID";
        }
        else
            return "INVALID";
        
    }
}

class TestaVerifyCreditCard{

    public static void main(String[] args){
    
        System.out.println(new VerifyCreditCard().checkDigits("11111101"));
    }
}