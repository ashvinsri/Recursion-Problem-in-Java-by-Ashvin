/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem5;
import java.util.*;
/**
 *
 * Maximum cut in rope 
 */
public class Test {
    static int cutInRope(int n,int a,int b,int c)
    {
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        int res=Math.max(Math.max(cutInRope(n-a,a,b,c),cutInRope(n-b,a,b,c)),cutInRope(n-c,a,b,c));
        if(res==-1)
            return -1;
        return res+1;
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        int result=cutInRope(n,a,b,c);
        System.out.print(result);
    }
    
}
