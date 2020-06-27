package com.wipro.arrays;

import java.util.Arrays;

public class Ex7 {
	public static void main(String[] args)
	{
		int a[]= {12,34,12,45,67,89};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j])
			{
			
				a[j]=-1;
			}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			System.out.print(a[i]+" ");
		}
	}
}
