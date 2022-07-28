
package Inheritance;

class Number
{
	int a=10;
	int b=15;
	
}
class AddNumber extends Number
{
	public void sum()
	{
		System.out.println(a+b);
	}
}
class MultiplyNumber extends Number
{
 public void multi()
 {
	 System.out.println(a*b);
 }
}

public class Hierarchical_Inheritance_demo2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AddNumber obj1=new AddNumber();
		obj1.sum();
		MultiplyNumber obj2=new MultiplyNumber();
		obj2.multi();

	}

}
