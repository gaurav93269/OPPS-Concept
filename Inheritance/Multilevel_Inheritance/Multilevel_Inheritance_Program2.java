package Inheritance;

 class Animal 
{
	public void eat()
	{
		System.out.println("eating");
	}
}
 class Dog extends Animal
   { 
	public void bark()
	{
		System.out.println("Barking");
	}
}
 class BabyDog extends Dog
    {
	public void weep()
	{
		System.out.println("weaping");
    }
 }
 class  Multilevel_Inheritance_demo1
 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BabyDog BD=new BabyDog();
		BD.eat();
		BD.weep();
		BD.bark();

	}

}


