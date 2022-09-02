package Abstraction;

abstract class Bike
{
	abstract void run();
}
 class Honda extends Bike
 {
	 void run()
	 {
		 System.out.println("made by honda company");
	 }
 }
class pulser extends Bike
{
	void run()
	{
		System.out.println("Made by Bajaj complany");
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Honda h= new Honda();
		h.run();
		pulser p= new pulser();
		p.run();
		

	}

}
