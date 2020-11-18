/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;
import java.util.*;
/**
 *   Write a recursive code to print 1 to n
 */


public class Test {
    static void print(int n)
    {
        if(n==1)
        {
            System.out.print("1");
            return;
        }
        print(n-1);
        System.out.print(n);
    }
    public static void main(String args[])
    {
        print(7);
    }
    
}
