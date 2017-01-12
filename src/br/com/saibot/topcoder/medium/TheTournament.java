/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class TheTournament {
    
    public String findLeader(String[] matches){
    
        Set<String> set = new HashSet<String>();
        
        for(String temp: matches){
        
            String[] c = temp.split(" ");
            for(int i = 0; i < c.length; i++){
            
                if(i != 1)
                    set.add(c[i]);
            }
        }
        
        int[] vezesJogadas = new int[set.size()];
        int count  = 0;
        for(String nome: set){
        
            for(String temp: matches){
            
                String[] c = temp.split(" ");
                for (String c1 : c) {
                    
                    if(nome.equals(c1))
                        vezesJogadas[count]++;
                }
            }
            
            count++;
        }
        
        int[] vezesGanhadas = new int[set.size()];
        count = 0;
        for(String nome: set){
        
            for(String temp: matches){
            
                String[] c = temp.split(" ");
                for(int i = 0; i < c.length; i++){
                
                    if(nome.equals(c[i]) && i == 0)
                        vezesGanhadas[count]++;
                }
            }
            
            count++;
        }
        ArrayList<String> list = new ArrayList<String>(set);
        ArrayList<String> ganhadores = new ArrayList<String>();
        int ratio = 100;
        
        for(int i = 0; i < vezesGanhadas.length; i++){
            
            String nome = list.get(i);
            
            if(vezesJogadas[i] - vezesGanhadas[i] <= ratio){
                
                ratio = vezesJogadas[i] - vezesGanhadas[i];
                ganhadores.add(nome);
            }
                    
        }

        if(ganhadores.size() == 1){
            return ganhadores.get(0);
        }    
        else{
            Collections.sort(ganhadores);
            return ganhadores.get(0);
        }
    }
}

class TestaTheTournament{

    public static void main(String[] args){
    
        String[] matches = {"Ted defeats Kate", "Kate defeats Billy", "Ted defeats Billy"};
        
        System.out.println(new TheTournament().findLeader(matches));
    }
}