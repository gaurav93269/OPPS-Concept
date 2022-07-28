package Inheritance;
class Teacher
{
	public void teach()
	{
		System.out.println("Teacher Teaching ");
	}
}
class Student extends Teacher
{
	public void learn()
	{
		System.out.println("Student learning");
	}
}
class Principal extends Teacher
{
	public void evaluate()
	{
		System.out.println("Principal evaluating ");
	}
}

public class Hierarchical_Inheritance_demo1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Principal p= new Principal();
		p.teach();
		p.evaluate();	
		Student s= new Student();
		s.learn();

	}

}
