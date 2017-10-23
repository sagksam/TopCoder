/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.Arrays;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class Elections  {
    
    public int visit(String[] likelihoods){
        int result = 0;
        double menor = 50000000;
        for (int j = 0; j < likelihoods.length; j++) {
            String likelihood = likelihoods[j];
            int temp = 0;
            for(int i = 0; i < likelihood.length(); i++){
                char c = likelihood.charAt(i);
                if(c == '1')
                    temp++;
            }
            double per = (double) temp / (likelihood.length()) * 100;
            if(per < menor){
                menor = per;
                result = j;
            }    
        }

        return result;
    }
}

class TestarElections {

    public static void main(String[] args){
    
        String[] likelihoods = {"111","112","121","122","211","212","221","222"};
        System.out.println(new Elections ().visit(likelihoods));
    }
}