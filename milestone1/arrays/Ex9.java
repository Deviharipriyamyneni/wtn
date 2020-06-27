package com.wipro.arrays;

public class Ex9 {
	 public static void main(String[] args)
	  {
		  int a[]= {1, 99, 10};
		  int b[]= new int[a.length];
		 int k=0;
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]!=10)
			 {
				 b[k++]=a[i];
			 }
		 }
		 for(int j=k;j<a.length;j++)
		 {
			 b[j++]=0;
		 }
		 for(int i=0;i<b.length;i++)
		 {
			 System.out.print(b[i]+" ");
		 }
	  }
}
