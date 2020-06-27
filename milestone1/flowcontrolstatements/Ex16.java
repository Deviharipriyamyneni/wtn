package com.wipro.flowcontrolstatements;

public class Ex16 {
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int num=0;
		while(n>0)
		{
			num=num*10+n%10;
			n=n/10;
		}
		System.out.println(num);
	}
}
