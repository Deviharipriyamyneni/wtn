package com.wipro.arrays;

public class Ex1 {
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			sum+=Integer.parseInt(args[i]);
		}
		System.out.println(args.length);
		System.out.print("Sum is "+sum+" and average is "+(float)sum/(float)args.length);
	}

}
