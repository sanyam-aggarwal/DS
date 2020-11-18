package ds;

import java.util.Arrays;


public class Sort 
{
	public static void main(String[] args)
	{
		
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=((int)(Math.random()*100)-1);
		}
		System.out.print("before sorting ");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.print("after sorting   ");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
}

