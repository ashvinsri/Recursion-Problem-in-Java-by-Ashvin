/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemZ12;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    static void insert(Stack<Integer> st,int val)
    {
        if(st.size()==0)
        {
            st.push(val);
            return;
        }
        int temp=st.pop();
        insert(st,val);
        st.push(temp);
    }
    public static void reverse(Stack<Integer> st)
    {
        if(st.isEmpty()==true)
        {
            return;
        }
        int val=st.pop();
        reverse(st);
        insert(st,val);
    }
    public static void main(String args[])
    {
        Stack<Integer> st=new Stack<Integer>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        System.out.println(st);
        reverse(st);
        System.out.print(st);
    }
}
