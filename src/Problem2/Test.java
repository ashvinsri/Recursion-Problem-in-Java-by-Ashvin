/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

/**
 * PROGRAM to find the factorial of number
 * 
 */
public class Test {
    static int factorial(int n)
    {
        if(n==0)
            return 1;
        int small_int=factorial(n-1);
        return n*small_int;
    }
    public static void main(String args[])
    {
        System.out.println(factorial(5));      
    }
}
