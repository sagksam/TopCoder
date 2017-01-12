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
public class DividingIntoTeams  {
 
    public String findYourTeam(int[] alexFriends, int[] bobFriends, int[] charlieFriends, int k){
    
        ArrayList<Integer> cont = new ArrayList<Integer>();
        boolean temp = false;
        String j = "";
        while(!temp){
        
            for(int i = 0; i < alexFriends.length; i++){
            
                if(!cont.contains(alexFriends[i])){
                    cont.add(alexFriends[i]);
                    if(alexFriends[i] == k){
                        temp = true;
                        j = "Alex";
                   }
                  break;
                }  
            }
            for(int i = 0; i < bobFriends.length; i++){
            
                if(!cont.contains(bobFriends[i])){
                    cont.add(bobFriends[i]);
                    if(bobFriends[i] == k){
                        temp = true;
                        j = "Bob";
                    }
                  break;
                 }   
            }
            for(int i = 0; i < charlieFriends.length; i++){
            
                if(!cont.contains(charlieFriends[i])){
                    cont.add(charlieFriends[i]);
                    if(charlieFriends[i] == k){
                        temp = true;
                        j = "Charlie";
                     }
                  break;
                }    
            }
        }
        
        return j;
    }
    
}

class TestaDividingIntoTeams{

    public static void main(String[] args){
        
        int[] alex = {1, 2, 3, 4, 5};
        int[] bob = {1, 3, 5, 4, 2};
        int[] charlie = {5, 4, 3, 2, 1};
        System.out.println(new DividingIntoTeams().findYourTeam(alex, bob, charlie, 4));
    }

}
