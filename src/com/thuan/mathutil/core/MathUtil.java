/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thuan.mathutil.core;

/**
 *
 * @author LENOVO-PC
 */
public class MathUtil {
    public static long getFactorial(int n){
        long product = 1;
        
        if(n>20 || n< 0)
            throw  new IllegalArgumentException("n must be between 0..20");
        
        if(n == 0 || n==1)
            return 1;
        
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return  product;
    }
    
    
}
