package com.mycompany.lab3;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a whole number to see if it is prime");
        int number = keyboard.nextInt();
        boolean primeOutcome = isPrime(number);
        if (primeOutcome == true) {
            System.out.println("The number " + number + " is prime");
        }
        if (primeOutcome == false) {
            System.out.println("The number " + number + " is not prime");
        }
    }

    public static boolean isPrime(int n) {
       //if number is even, get, then it is not prime
        if (n % 2 == 0) {
            return false;
        }
        //if number is divisible by anything other than itself or 1, it is notprime
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
