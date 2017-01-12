/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * DONE ./ (Corrigir count > 100)
 * @author PauloHenrique
 */
public class GameOfStones {
    
    public int count(int[] stones){

        int maior = 0;
        int menor = stones[0];
        int indexMaior = 0, indexMenor = 0;
        int count = 0;
        if(!condititions(stones))
            return -1;
        else{
            
            while(!equals(stones)){
            
                
                for(int i = 0; i < stones.length; i++){
                
                    if(stones[i] > maior){
                        maior = stones[i];
                        indexMaior = i;
                    }    
                    if(stones[i] <= menor){
                        menor = stones[i];
                        indexMenor = i;
                    }    
                }
                stones[indexMaior] -= 2;
                stones[indexMenor] += 2;
                count++;
                maior = 0;
                menor = stones[0];
                if(count > 100)
                    break;

            }
        }
        
        if(count > 100)
            return -1;
        
        return count;
    }
    
    public boolean condititions(int[] stones){
    
        int result = 0;
        boolean odd = false;
        boolean pair = false;
        for(int i = 0; i < stones.length; i++){
        
            if(stones[i] % 2 != 0)
                odd = true;
            if(stones[i] % 2 ==0)
                pair = true;
            result += stones[i];
        }
        if(stones.length == 1)
            return false;
        if(result % stones.length != 0)
            return false;
        if(odd && pair)
            return false;
        
        return true;
    }
    
    public boolean equals(int[] stones){
    
        for(int i = 0; i < stones.length-1; i++){
        
            if(stones[i] != stones[i+1])
                return false;
        }
        
        return true;
    }
}

class TestaGameOfStones{

    public static void main(String[] args){
    
        int[] stones = {10,16};
        System.out.println(new GameOfStones().count(stones));
    }
}