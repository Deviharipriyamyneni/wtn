package com.wipro.flowcontrolstatements;

public class Ex4 {

	public static void main(String args[]) {
		char a=args[0].charAt(0);
		char b=args[1].charAt(0);
		
		if( Character.compare(a,b)<0)
		{
			System.out.println(a+","+b);
		}
		else

			System.out.println(b+","+a);
	 }
	 
}
