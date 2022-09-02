package Encapsulation;

public class Account 
{
	//for account number
     private int AccNo;
	public void setAccNO(int number)
	{
		AccNo=number;
	}
	public int getAccNo() 
	{
		return AccNo;
	}
	//for name
	private String Name;
	public void setName(String name) 
	{
		Name=name;
	}
	public String getName() 
	{
		return Name;
	}
	
	// for email Id
	private String Email_Id;
     public void setEmail(String email_Id)
	{
    	 Email_Id=email_Id;
	}
    public String getEmail() 
	{
		return Email_Id;
	}
    
     // to set amount 
    private float Amount;
	public void setAmount(float amount) 
	{
		 Amount= amount;
	}
	public float getAmount() 
	{
		return  Amount;
	}

}
class EncapculationDemo2 
{  
		public static void main(String[] args) 
		{  
		    //creating instance of Account class  
		    Account acc=new Account();  
		    
		    //setting values through setter methods  
		    acc.setAccNO(1234567);  
		    acc.setName("Gaurav yadav");  
		    acc.setEmail("Gaurav123@gmail.com");  
		    acc.setAmount(4500000f);  
		    
		    //getting values through getter methods
		    System.out.println(+acc.getAccNo()+"\n"+acc.getName()+" \n"+acc.getEmail()+" \n"+acc.getAmount());
		}  
}  
