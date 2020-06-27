package com.wipro.arrays;

public class Ex13 {
	public static void main(String args[][]) {
		   
		if(args.length<4)
		{
		   System.out.println("Please enter 4 integer numbers");
		}
		else

		{
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					args[i][j]=args[2-i][2-j];
				}
				/*String c=args[i];
				args[i]=args[args.length-i-1];
				args[args.length-i-1]=c;*/
			}
			System.out.println(" The reverse of the array is :");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
				System.out.print(args[i][j]+ " ");	
				}	
				System.out.println();
				}
				
		}
	}
}

