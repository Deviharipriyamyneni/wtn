package com.wipro.arrays;

public class Ex5 {
public static void main(String[] args)
{
	int fl=Integer.parseInt(args[0]);
	int sl=Integer.parseInt(args[0]);
	int fs=Integer.parseInt(args[0]);
	int ss=Integer.parseInt(args[0]);
	for(int i=1;i<args.length;i++)
	{
		if(Integer.parseInt(args[i])>fl)
		{
			sl=fl;
			fl=Integer.parseInt(args[i]);
		}
		if(Integer.parseInt(args[i])<fs)
		{
			ss=fs;
			fs=Integer.parseInt(args[i]);
				
		}
	}
	System.out.println("First large: "+fl+" Second large "+sl);
	System.out.println("First small: "+fs+" Second small "+ss);
}
}
