package com.wipro.arrays;

public class Ex2 {
	public static void main(String[] args)
	{
	int min=Integer.parseInt(args[0]),max=Integer.parseInt(args[0]);
	for(int i=1;i<args.length;i++)
	{
		if(min>Integer.parseInt(args[i]))
				{min=Integer.parseInt(args[i]);}
		if(max<Integer.parseInt(args[i]))
				{max=Integer.parseInt(args[i]);}
		
	}
	System.out.print("minimum is "+min+" maximum is "+max);
	}
}
