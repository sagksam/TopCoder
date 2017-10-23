/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * DONE ./
 * @author PauloHenrique
 */
public class UsingStats  {
    
    public int getMedian(int[] vals, int mean){
    
        int total = 0;
        double g = total;
        double meanTotal = 0;
        ArrayList<Integer> ne = new ArrayList<Integer>();
        for(int c: vals){
            total += c;
            ne.add(c);
        }    
        double t  = vals.length+1;
        while(meanTotal != mean){
        
            meanTotal = ++g / t;

        }
        int element  = (int) g - total;
        ne.add(element);
        Collections.sort(ne);
        return ne.get((int) t / 2);
    }
}

class TestaUsingStats {

    public static void main(String[] args){
    
        int[] vals = {-211,-504,461,283,791,646,205,459,-186,516,-933,762,418,656,746,-368,888,270,-355,-207,-990,435,717,-338};
        System.out.println(new UsingStats ().getMedian(vals, 845));
    }
}
