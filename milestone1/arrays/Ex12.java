package com.wipro.arrays;

public class Ex12 {
public static void main(String[] args)
{
	int a[]= {1,2,3};
	int b[]= {4,5,6};
	int c[] =new int[2];
	int k=0;
	c[k++]=a[a.length/2];
	c[k++]=b[b.length/2];
	for(int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
			
	
}
}
