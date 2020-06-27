package com.wipro.arrays;

public class Ex3 {
	public static void main(String[ ] args)
	{
		int key=2,f=0,i;
		for(i=1;i<args.length;i++)
		{
			if(Integer.parseInt(args[i])==key)
			{
				f=1;
				break;
			}
		}
		if(f==1)
			System.out.println(i);
		else
			System.out.println("Not found");
	}
}
