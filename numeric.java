/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Java program to check whether given string
// is a valid integer number
 
class GFG 
{
    public static void main (String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
         
        try
        {
            // checking valid integer using parseInt() method
            Integer.parseInt(input1);
            System.out.println(input1 + " is a numeric");
        } 
        catch (NumberFormatException e) 
        {
            System.out.println(input1 + " is not a numeric");
        }
         
        try
        {
            // checking valid integer using parseInt() method
            Integer.parseInt(input2);
            System.out.println(input2 + " is a  numeric");
        } 
        catch (NumberFormatException e)
        {
            System.out.println(input2 + " is not a numeric");
        }
    }
}
