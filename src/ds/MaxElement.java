package ds;

import java.util.Scanner;
public class MaxElement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int max=0;
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>max)
			{
				max=a[i];
			}
		}
			System.out.print(max);
			sc.close();
	}

}