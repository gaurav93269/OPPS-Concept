package Encapsulation;

	class employee
	{
	 private int Empid; //here private key word use to data hiding
	 
	 public void setEmpid(int empid)
	 {
		 Empid=empid;
	 }
  public int getEmpid()
  {
	   return Empid;
  }
}
public class EncapsulationDemo 
{
    public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    	employee obj=new employee();
    	obj.setEmpid(45);
    	System.out.println(obj.getEmpid());
	}

}
