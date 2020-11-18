/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

/**
 * Write a rogram to print the Fibbonacci Series
 *
 */
public class Test {
    static int fibbonacci(int n)
    {
       if(n==0)
           return 0;
       if(n==1)
           return 1;
        return fibbonacci(n-1)+fibbonacci(n-2);
    }
    public static void main(String args[])
    {
        System.out.println(fibbonacci(6));
    }
}
