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
public class CampLunches {
    
    public int firstMatching(String[] menu1, String[] menu2){
    
        boolean encontrou = false;
        int dia = 0;
        int maior = Math.max(menu1.length, menu2.length);
        int tamanhoMenu1 = 0;
        int tamanhoMenu2 = 0;
        
        while(!encontrou){
        
            if(tamanhoMenu1 == menu1.length){
                tamanhoMenu1 = 0;
            }
            if(tamanhoMenu2 == menu2.length)
                tamanhoMenu2 = 0;
               
            if(menu1[tamanhoMenu1].equals(menu2[tamanhoMenu2])){
                encontrou = true;
            }
            
            if(encontrou == false)
              dia++;
            tamanhoMenu1++;
            tamanhoMenu2++;
            
            if(dia == 50000)
                encontrou = true;
        }
        
        if(dia >= 50000)
            return -1;
        
        return dia;
    
    }
}

class TestaCampLunches{

    public static void main(String[] args){
    
        String[] a = {"pbj", "pizza"};
        String[] b = {"pizza", "pbj"};
        System.out.print(new CampLunches().firstMatching(a, b));
    
    }

}
