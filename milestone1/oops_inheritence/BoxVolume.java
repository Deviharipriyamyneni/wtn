package com.wipro.oops_inheritence;

import java.util.*;
class Box{
    int w,h;
    double d;
    Box(int w,int h,double d)
    {
        this.w=w;
        this.h=h;
        this.d=d;
    }
    double volume()
    {
        return (w*h*d);
    }
}
public class BoxVolume {
    public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
   int w,h;
   double d;
   w=sc.nextInt();
   h=sc.nextInt();
   d=sc.nextDouble();
Box b=new Box(w,h,d);
double v=b.volume();
System.out.println("The volume of the box is: "+v);
sc.close();
        
    }
}
