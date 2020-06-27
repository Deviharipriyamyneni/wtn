package com.wipro.arrays;

public class Ex10 {
	public static void main(String[] args)

	{
		int a[]= {1, 0, 1, 0, 0, 1, 1};
		int e[]=new int[a.length];
		int o[]=new int[a.length];
		int oi=0,ei=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				e[ei++]=a[i];
			}
			else {
				o[oi++]=a[i];
			}
		}
		for(int i=0;i<ei;i++)
		{
			System.out.print(e[i]+" ");
		}
		for(int i=0;i<oi;i++)
		{
			System.out.print(o[i]+" ");
		}
	}
}
