package Abstraction;
abstract  class Vehical
{
	 abstract void start();
}
class Car extends Vehical
{
	void start()
	{
		System.out.println("Start with key");
	}
}
class Scooter extends Vehical
{
	void start()
	{
		System.out.println("Start with kick");
	}
}
class AbstractDemo2
{

	public static void main(String[] args) 
	{
		Car c=new Car();
		c.start();
		
		Scooter s= new Scooter();
		s.start();
	}

}
