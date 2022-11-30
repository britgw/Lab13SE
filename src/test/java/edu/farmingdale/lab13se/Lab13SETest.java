/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.farmingdale.lab13se;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author skysn
 */
public class Lab13SETest {
    

   
    @Test
    public void testPrimeNumFalse() {
        System.out.println("primeNum");
        int numberInput = 10;
        boolean expResult = false;
        boolean result = Lab13SE.primeNum(numberInput);
        assertEquals(expResult, result);
    }
    @Test
    public void testPrimeNumTrue() {
        System.out.println("primeNum");
        int numberInput = 3;
        boolean expResult = true;
        boolean result = Lab13SE.primeNum(numberInput);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFiveNum1() {
        System.out.println("fiveNum");
        int numberInput = 12;
        boolean expResult = false;
        boolean result = Lab13SE.fiveNum(numberInput);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFiveNum() {
        System.out.println("fiveNum");
        int numberInput = 3;
        boolean expResult = true;
        boolean result = Lab13SE.fiveNum(numberInput);
        assertEquals(expResult, result);
}
    
}
