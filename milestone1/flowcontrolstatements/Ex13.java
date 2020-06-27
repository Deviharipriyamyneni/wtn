package com.wipro.flowcontrolstatements;

public class Ex13 {
	public static void main(String[] args)
	{
		for(int n=10;n<99;n++)
		{
		int f=0;
		//System.out.print(n+" ");
		//if(n==2) {f=0;}
		
			int c=0;
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
				{
					c++;
				}
				if(c>0)
				{
					f=1;
					break;
				}
			}
		
		if(f==0)
			System.out.println(n);
		
		
		}
	}
}
