/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.easy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author PauloHenrique
 */
public class CurrentTime {
    
    public static String printTime(){
        
        return "Current time is " + new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
    }
    
    public static void main(String[] args){
    
        System.out.println(CurrentTime.printTime());
    }
}
