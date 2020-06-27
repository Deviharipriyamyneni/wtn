package com.wipro.arrays;

import java.util.Arrays;

public class Ex6 {
	public static void main(String[] args)
	{
		int a[]= {4,5,10,2,5,2,65};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
