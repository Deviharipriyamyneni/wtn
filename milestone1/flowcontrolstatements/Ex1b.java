package com.wipro.flowcontrolstatements;


public class Ex1b {
	public static boolean lastDigit(int a,int b)
	{
		if(a%10==b%10)
			return true;
		else
			return false;
	}
	 public static void main(String args[]) {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			boolean f= lastDigit(a,b);
			System.out.println(f);
			
		 }
}
