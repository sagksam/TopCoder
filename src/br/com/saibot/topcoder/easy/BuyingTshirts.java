/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.ArrayList;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class BuyingTshirts  {
    
    public int meet(int T, int[] Q, int[] P){
    
        ArrayList<Integer> pb = new ArrayList<Integer>();
        ArrayList<Integer> qm = new ArrayList<Integer>();
        int total = 0;
        for(int i = 0; i < Q.length; i++){
            total += Q[i];  
            if(total >= T){
            
                qm.add(i);
                total = total - T;
            }
        }
        total = 0;
        for(int i = 0; i < P.length; i++){
            total += P[i];  
            if(total >= T){
            
                pb.add(i);
                total = total - T;
            }
        }
        pb.retainAll(qm);
        return pb.size();
    }

}
class TestaBuyingTshirts {

    public static void main(String[] args){
    
        int[] Q = {1,2,1,2,1,2,1,2};
        int[] P = {1,1,1,1,2,2,2,2};
        new BuyingTshirts ().meet(2, Q, P);
    }
}