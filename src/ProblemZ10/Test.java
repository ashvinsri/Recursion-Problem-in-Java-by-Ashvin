/*
 *   Sort an array using recursion 
     I/P---->   arr[]={4,3,2,10}  
     O/P---->   arr[]={2,3,4,10}
 *
 */
package ProblemZ10;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void sorting(List<Integer> arr)
    {
        if(arr.size()==1)
            return;
        int temp=arr.remove(arr.size()-1);
        sorting(arr);
        insert(arr,temp);
    }
    public static void insert(List<Integer> arr,int temp)
    {
        if(arr.size()==0||arr.get(arr.size()-1)<temp)
        {
            arr.add(temp);
            return;
        }
        int val=arr.remove(arr.size()-1);
        insert(arr,temp);
        arr.add(val);
    }
    public static void main(String args[])
    {
        List<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add(1);
        al.add(31);
        al.add(5);
        sorting(al);
        for(Integer i:al)
        {
            System.out.println(i);
        }
            
    }
    
}
