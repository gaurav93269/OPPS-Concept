import java.util.Scanner;

public class encap_Demo 
{
	private int pin_no;
	private String pass;
	int pho_no,ac_no;
	String name,Bank_name;
	
	public int getPin_no() {
		return pin_no;
	}
	public void setPin_no(int pin_no) {
		this.pin_no = pin_no;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

	
}
----------------------
import java.util.Scanner;

public class encap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		encap1 obj=new encap1();
		obj.demo();

	}

	public void demo()
	{
		int val1;
		String user_str;
		encap_Demo obj=new encap_Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name");
		obj.name=sc.nextLine();
		System.out.println("Enter Your Bank name");
		obj.Bank_name=sc.nextLine();
		System.out.println("Enter Your Account Number");
		obj.ac_no=sc.nextInt();
		System.out.println("Enter Your Phone Number");
		obj.pho_no=sc.nextInt();
		System.out.println();
		
		System.out.println("Enter Your password");
		user_str=sc.nextLine();
		System.out.println("Enter Your Pin Number");
		val1=sc.nextInt();
		
		obj.setPin_no(val1);
		obj.setPass(user_str);
		
		
		System.out.println("Name:"+obj.name);
		System.out.println("No:"+obj.pho_no);
		System.out.println("Bank Name:"+obj.Bank_name);
		System.out.println("Account Number:"+obj.ac_no);
		System.out.println("The password is ="+obj.getPass());
		System.out.println("The Pin NUmber is ="+obj.getPin_no());
	}
}