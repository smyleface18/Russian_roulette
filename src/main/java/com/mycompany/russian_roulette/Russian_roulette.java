/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.russian_roulette;

import java.util.Random;

/**
 *
 * @author SCIS2
 */
public class Russian_roulette {

    public static void main(String[] args) {
        

       boolean value = true;
        int life = 7;
        while(value){
            
            int number = (int) (Math.random() * 100) + 1;
            System.out.println(number);
            if(number%2 == 0){
                try{
                    int exception = 2/0;   
                    
                }
                catch (Exception e){
                    System.out.println("el numero que rompio el: "+number);
                    life -=1;
                }
            }
            if(life == 0){
                value = false;
            }
            
        }
    }
}
