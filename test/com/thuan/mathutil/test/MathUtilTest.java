/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.thuan.mathutil.test;

//import org.junit.jupiter.api.Test; //JUnit 5 Maven
//import static org.junit.jupiter.api.Assertions.*;

import com.thuan.mathutil.core.MathUtil;
import org.junit.Test; // JUnit 4
import static org.junit.Assert.*;
/**
 *
 * @author LENOVO-PC
 */
public class MathUtilTest {
    //test case 1: valid argument
    // n = 0, expected = 1, actual= ?
    @Test
    public void testFactorialGivenValidArgumentReturnWell(){
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        
        assertEquals(expected, actual);
    }
    
    
}
