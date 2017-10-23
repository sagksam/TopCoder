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
public class TwoTurtledoves  {
    
    public int presentType(int n){
        int result = 0;
        int count = 1;
        for(int i = 1; i <= n; i++){
            for(int j = i; j > 0; j--){
            
                if((n-= j )<1)
                    return j;
            }
        }
        return 0;
    }
}

class TestaTwoTurtledoves  {

    public static void main(String[] args){
    
        System.out.println(new TwoTurtledoves ().presentType(399));
    }
}