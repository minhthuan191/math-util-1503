/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thuan.mathutil.main;
import com.thuan.mathutil.core.MathUtil;
/**
 *
 * @author LENOVO-PC
 */
public class Main {
    public static void main(String[] args) {
        //CASE #1: Check 0!
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        System.out.println("Check 0! expected:" + expected + "; actual:" +actual);
        //CASE #2: Check 6!
        expected = 720;
        actual = MathUtil.getFactorial(6);
        System.out.println("Check 6! expected:" + expected + "; actual:" +actual);
        //CASE #3: Check exception (-5!)
        actual = MathUtil.getFactorial(-5);
    }
}
