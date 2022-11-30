/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.farmingdale.lab13se;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author skysn
 */
public class Lab13SE {

    public static void main(String[] args) {
        
       int numberInput;
       int sum = 0;
       Scanner x = new Scanner(System.in);
       List<Integer> numberPrime = new ArrayList<>();
       System.out.println("Find the sum of all the prime numbers from 0 to n that has 5.\n");
        
       while(true) {
            System.out.print("Please enter your number: ");
            numberInput = x.nextInt();
            for (int i = 0; i < numberInput; i++) {
              if(primeNum(i)) {
                 if(fiveNum(i)) {
                 numberPrime.add(i);
                  }
              }
           }
            for (int i: numberPrime) {
              System.out.print(i + " ");
              sum = sum + i;
            }
            System.out.println("\nThe sum of the prime numbers that go from 0 to " + numberInput + " is " + sum + "\n");
            
        } 
    }
    public static boolean primeNum(int numberInput) {
        boolean flag = false;
        for (int i = 2; i <= numberInput / 2; ++i) {
        if (numberInput % i == 0) {
          flag = true;
          break;
          }
        }
        return !flag;
    }
    
    public static boolean fiveNum(int numberInput) {
        boolean flag = false;
        String sNumber = Integer.toString(numberInput);
        char[] c = new char[sNumber.length()];
        for (int i = 0; i < c.length; i++) {
          c[i] = sNumber.charAt(i);
          if (c[i] == '5') {
            flag = true;
            break;
          }
        }
        return flag;
    }
}
    

