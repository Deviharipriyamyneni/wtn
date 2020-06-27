package com.wipro.flowcontrolstatements;

public class Ex14 {
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int sum=0;
		while(n>0)
		{
			sum+=n%10;
			n=n/10;
		}
		System.out.println(sum);
	}

}
