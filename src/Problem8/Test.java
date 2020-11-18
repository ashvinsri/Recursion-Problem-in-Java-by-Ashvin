/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem8;

/**
 *
 * BubbleSort USing Recursion
 * 
 */

public class Test {
    static void bubbleSort(int arr[],int n)
    {
        if(n==0)
            return;
        for(int j=0;j<n-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }
        }
        bubbleSort(arr,n-1);
    }
    public static void main(String args[])
    {
        int arr[]={5,7,3,2,1};
        bubbleSort(arr,5);
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

class A {
    static void bubbleSortRecursive(int arr[],int j,int n)
    {
        if(n==1)
            return;
        if(j==n-1)
        {
            bubbleSortRecursive(arr,0,n-1);
            return;
        }
        if(arr[j]>arr[j+1])
        {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
        bubbleSortRecursive(arr,j+1,n);
    
    }
    public static void main(String args[])
    {
        int arr[]={5,7,3,2,1};
        bubbleSortRecursive(arr,0,5);
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
