import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int sort;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sort=a[0];
		for(int i=0;i<n;i++)
		{
			if(sort>a[i])
			{
				sort=a[i];
			}
		}
		System.out.println(sort);
	}
}
