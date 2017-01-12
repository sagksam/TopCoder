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
public class BearPlays  {
    
    public int pileSize(int A, int B, int K){
        if(A == B)
            return 0;
        int menor = 0;
        while(K > 0){
            
            if(A < B){
            
               B = B - A;
               A = A * 2;
               K--;
            }    
            if(B < A){
            
                A = A - B;
                B = B * 2;
                K--;
            }

        }
        if(A < B)
            return A;
        else
            return B;
    }
}

class TestarBearPlays {

    public static void main(String[] args){
    
        System.out.println(new BearPlays ().pileSize(900000000, 350000000, 3));
    }
}