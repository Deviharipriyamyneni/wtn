package com.wipro.arrays;

public class Ex14 {

	  public static void main(String args[]) {
		   
		  if(args.length<9)
		  {
		     System.out.println("Please enter 9 integer numbers");
		  }
		  else

		  {
		      int max=Integer.parseInt(args[0]);
		      for(int i=1;i<args.length;i++)  

		  if(max<Integer.parseInt(args[i]))
		  {
		      max=Integer.parseInt(args[i]);
		  }
		    System.out.println("The biggest number in the given array is "+max); 
		  }  
		      
	  }
}
