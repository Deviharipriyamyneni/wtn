package com.wipro.flowcontrolstatements;

public class Ex3 {
	 public static void main(String args[]) {
		 if(args.length==0)
		 {
			 System.out.println("No Values");
		 }
		 else {
			 int i=0;
			 for( i=0;i<args.length-1;i++)
			 {
				 System.out.print(args[i]+",");
			 }
			 System.out.print(args[i]);
		 }
	 }
	 
		
}
