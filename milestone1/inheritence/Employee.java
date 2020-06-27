package com.wipro.inheritence;

public class Employee extends Person{
   private double salary;
   private  String insur;
   private int start_year;
Employee(String n,double sal,int y,String ins)
{
    super.name=n;
    salary=sal;
    start_year=y;
    insur=ins;
}
void print(){  
System.out.println(super.name+" "+salary+" "+start_year+" "+insur);  
}  
}  