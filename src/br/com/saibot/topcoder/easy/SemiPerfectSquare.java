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
public class SemiPerfectSquare {
    
    public String check(int N){
    
        double sum = 0;
        String result = "No";
        int a = 1;
        
        sum = Math.sqrt(N);
         
         if(sum % 1 == 0)
             result = "Yes";
         
         else{
           sum = 0;          
             for(int i = 1; i <= N; i++){               
                 sum = Math.sqrt((float)N / i);
                 if(sum % 1 == 0)
                     break;
             
             }
             
            while(a < sum){
             double temp = (a * sum * sum);
             if(temp == N)
                 result = "Yes";
             
             a = a + 1;
           
            }
           
           }         
    
        return result;
    }
}

class TestaSemiPerfectSquare{

   public static void main(String[] args){
   
     System.out.println(new SemiPerfectSquare().check(48));
   }
}
