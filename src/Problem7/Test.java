/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem7;

/**
 * Find a to the power n using recursion...
 * so we will see the two methods one in n time complexity other one in logn
 * 
 */
public class Test {
    static long findPower(long a,long n)
    {
        if(n==0)
            return 1;
        return a*findPower(a,n-1);
    }
     static long findFastPower(long a,long n)
    {
        if(n==0)
            return 1;
        
        long smaller_sol=findPower(a,n/2);
        smaller_sol*=smaller_sol;
        if((n&1)==1)
        {
            smaller_sol*=5;
        }
        return smaller_sol;
    }
    public static void main(String args[])
    {
        long a=2;
        long n=40;
        System.out.println(findPower(a,n));
        System.out.println(findFastPower(a,n));
    }
}
