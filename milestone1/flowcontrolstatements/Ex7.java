package com.wipro.flowcontrolstatements;

public class Ex7 {
	 public static void main(String args[]) {
		 char c=args[0].charAt(0);
		 if(c>='a'&&c<='z')
		 {
			 System.out.println((char)(c-32));
		 }
		 else if(c>='A'&&c<='Z')
		 {
			 System.out.println((char)(c+32));
		 }
	 }

}
