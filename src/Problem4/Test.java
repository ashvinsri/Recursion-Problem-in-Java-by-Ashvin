/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

/**
 *
 * Write a recursive program to check If array is sorted or not
 * 
 */
public class Test {
    static boolean isSorted(int arr[],int n)
    {
        if(n==1||n==0)
            return true;
        if(arr[n-1]>arr[n-2] && isSorted(arr,n-1))
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,6,4,5};
        System.out.println(isSorted(arr,5));
    }
}
