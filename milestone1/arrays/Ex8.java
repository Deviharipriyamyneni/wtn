package com.wipro.arrays;

public class Ex8 {
  public static void main(String[] args)
  {
	  int a[]= {10,3,6,1,2,7,9};
	  int f=0,s=0;
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]==6&&f==0)
		  {
			  f=1;
		  }
		  if(f==0) { s+=a[i];}
		  if(a[i]==7&&f==1)
		  {
			  f=0;
		  }
	  }
	  System.out.println(s);
  }
}
