package com.wipro.arrays;

public class Ex11 {
public static void main(String[] args)
{
	int a[]= {1,1,4,4,1,4};
	boolean f=true;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=1 && a[i]!=4)
		{
			//System.out.println(a[i]);
			f=false;
			break;
		}
	}
	
		System.out.println(f);
	
	
}
}
