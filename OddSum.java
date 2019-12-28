package com.deloitte;

import java.util.Scanner;

public class OddSum 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n,d,c=0,s=0;
		System.out.println("Enter the number to be checked :=");
		n = in.nextInt();
		while(n!=0)
		{
			d=n%10;
			c=c+1;
			n=n/10;
			if(d%2!=0)
			{
				s=s+d;
			}
		}
		if(c>=3)
		{
			System.out.println("The sum of odd digits = "+s);
		}
		else
		{
			System.out.println("Please enter a number which is of 3-digits or more");
		}
		in.close();
	}
}
