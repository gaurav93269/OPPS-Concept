package OOPS;
import java.util.Scanner;
public class single_inheritance_class1 
{
	     public static void sum_digit()
		   {  
		       int i,num,r,sum=0;
		      Scanner sc=new Scanner(System.in);
		      System.out.println("Enter the number to find sum of digit");
		       num=sc.nextInt();   
		   while(num>0)
		    {    
		   r=num%10;  //getting remainder  
		   sum=sum+r;
		   num=num/10;
		     }
		   System.out.println("sum of digit is"+sum);
		}

	}
===============================================
package OOPS;

public class single_inheritance_class2 extends single_inheritance_class1
{
   public static void main(String []args)
   {
	   single_inheritance_class2 obj=new single_inheritance_class2();
	   obj.sum_digit();
   }
}
