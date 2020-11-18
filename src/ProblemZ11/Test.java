/*
 *   Delete the middle element of Stack
     I/P:-
     st=[3,5,2,1,11]
     O/P:-
     st=[3,5,1,11]
 */
package ProblemZ11;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    static void deleteRecursive(Stack<Integer> st,int n)
    {
        if(st.size()==0)
        {
            return;
        }
        int val=st.pop();
        deleteRecursive(st,n-1);
        if(n!=0)
        {    
        st.push(val);
        }
    }
    static Stack<Integer> deleteMiddle(Stack<Integer> st)
    {
        int length=st.size();
        if(length%2==0)
            deleteRecursive(st,(length/2)+1);
        else
            deleteRecursive(st,(length/2));
        return st;   
    }
    public static void main(String args[])
    {
        Stack<Integer> st=new Stack<Integer>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        Stack<Integer> result=deleteMiddle(st);
        System.out.print(result);   
        
    }
}
