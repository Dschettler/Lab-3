/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.Random;

/**
 *
 * @author Deric
 */
public class EvenOddCounter {
    public static void main(String[] args) {
        int counter = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        
        while(counter <100){
            int randomNumber = myRand();
            boolean isEven = isEven(randomNumber);
            if (isEven == true){
                evenCounter++;
            }else{
                oddCounter++;
            }
            counter++;
            System.out.println(randomNumber + " " + isEven);
            
        }
        System.out.println("The number of even numbers was: "+ evenCounter);
        System.out.println("The number of odd numbers was: "+oddCounter);
        
    }
    public static int myRand(){
        Random myRand = new Random();
        int randomNumber = myRand.nextInt();
        return randomNumber;
    }
    public static boolean isEven(int number){
           
        if ((number%2)==0){
            return true;
        }else{
            return false;
        }
    }
}
