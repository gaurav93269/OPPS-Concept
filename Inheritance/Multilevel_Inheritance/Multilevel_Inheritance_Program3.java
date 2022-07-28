package Inheritance;

import java.util.Scanner;

 class Area
{
	public static void display()
	{
		System.out.println("display");
	}
}
    class Triangle extends Area
    {
    	public static void triangle()
    	{
    	int base,height,area;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the base");
		base=sc.nextInt();
		System.out.println("enter the height");
		height=sc.nextInt();
		 area=((base*height)/2);
		 System.out.println( "Area of trainge is: "+area);
		 }
    } 
    class Perimeter extends Triangle
    {
    	public static void perimeter()
    	{
    	int a,b,c;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the side a,b,c");
    	a=sc.nextInt();
    	b=sc.nextInt();
    	c=sc.nextInt();
    	int res=a+b+c;
    	System.out.println("Perimeter of traingle is: "+res);
	  }
    }
  
public class Multilevel_Inheritance_demo2  extends Perimeter
{
    public static void main(String[] args)
    {
    	//Perimeter p=new Perimeter();
         display();
         triangle();
         perimeter();
    	
	}
}
