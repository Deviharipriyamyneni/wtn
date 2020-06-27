package com.wipro.oops_inheritence;
class Powers{
static int power(int num1, int num2)
{
	double n1=num1;
	double n2=num2;
	return (int)Math.pow(n1,n2);
}
static double power(double num1, double num2)
{
	
	return Math.pow(num1,num2);
}
}
public class Calculator {
public static void main(String[] args)
{
	System.out.println(Powers.power(2,3));
	System.out.println(Powers.power(2.5,3));
}
}
