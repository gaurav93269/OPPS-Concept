import java.util.Scanner;

public class Inheritance
{
     public static void Arthmatic()
	{ 
	 int num1,num2;
	 Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value of num1 and num2");
	  num1=sc.nextInt();
	  num2=sc.nextInt();
                  int Add=num1+num2;
                  System.out.println("Addition of two number is=" +Add);
	  int Multi=num1*num2;
	  System.out.println("Multiplication of two number is=" +Multi);
	}
}

=======================================================

package OOPS;

public class inheritance_1 extends Inheritance
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stud
      Arthmatic();
	}

}
