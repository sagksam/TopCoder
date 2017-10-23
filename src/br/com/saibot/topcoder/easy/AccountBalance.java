/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

/**
 * You are working for the financial institution TopBank, and you have been tasked with writing a module that will take an initial account balance, along with a list of that day's transactions, and return the ending balance for the day.
 * Each transaction will be either a credit, which adds funds to the account, or a debit, which removes funds from the account. 
 * If a debit exceeds the available funds at the time, then the account balance will go negative. 
 * You will be given an startingBalance, the initial account balance. You will also be given a transactions, the list of transactions for the day. Each element of transactions will be in the form "type amount" (quotes added for clarity). 
 * Each type will be 'C' or 'D', for credit or debit, respectively. Each amount will be an integer between 1 and 1000000, inclusive, with no leading zeros. You are to return an representing the ending balance after processing all of the transactions
 * STATUS: DONE!!
 * @author PauloHenrique
 */  
public class AccountBalance {
    
    public int processTransactions(int startingBalance, String[]transactions){
        
        for(int i = 0; i < transactions.length; i++){
            
            String tipoTransacao = transactions[i].substring(0, 1);
            int valorTransacao = Integer.parseInt(transactions[i].substring(2, transactions[i].length()));
            System.out.println(tipoTransacao);
            System.out.println(valorTransacao);
            if("D".equals(tipoTransacao)){
                startingBalance = startingBalance - valorTransacao;
            }
            if("C".equals(tipoTransacao)){
                startingBalance = startingBalance + valorTransacao;
            }
        }
        
        return startingBalance;
    }
}

class TestaAccountBalance{
    
    public static void main(String[] args){
        
        String[] t = {"D 1234", "C 987", "D 2345", "C 654", "D 6789", "D 34567"};
        new AccountBalance().processTransactions(53874, t);
    }
}