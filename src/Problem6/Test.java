/*
 * FInd all the substring of given String for Example "ABC" -->" ", "A","B","C","AB","BC","CA","ABC" 
 *
 */
package Problem6;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    static void printSub(String str,String curr,int index)
    {
        if(index==str.length())
        {
            System.out.println(curr);
            return;
        }
        printSub(str,curr,index+1);
        printSub(str,curr+str.substring(index,index+1),index+1);
    }
    public static void main(String args[])
    {
       String str="AB";
        printSub(str,"",0);
    }
}
