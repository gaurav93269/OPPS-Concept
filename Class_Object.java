//what is class?

public class demo   // The class is one of the defining ideas of oops.
{
    public static void main(String[] args) 
    {
         /*collection of object is called class.
              eg. Class -color
                   red,orange,green - an object of color*/
    	
       System.out.println("welcome to class");
    }
}

============================================================
    
    //what is object?.

public class Object_demo
{
	public void class_1()
	{
		System.out.println("Welcome to class_1");
	}
	public void class_2()
	{
		System.out.println("Welcome to class_2");
	}

   public static void main(String []args)
   {
	   Object_demo obj=new Object_demo();//to calling the class we make an object
	   obj.class_1();//A Java object is a member (also called an instance) of a Java class. 
	   obj.class_2();//Each object has an identity, a behavior and a state
   }  
}


