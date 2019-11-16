package sample;

/**
 * Simple Java program for Interface
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

interface user
{
	double getMethod();
	void setMethod(double balance);
}
interface show extends user
{
	void msg();
}

public class example1 implements show
{
	private double balance=500;
	public double getMethod()
	{
		return balance;
	}
	public void setMethod(double balance)
	{
		this.balance=this.balance+balance;
	}
	public void msg()
	{
		System.out.println("Interface concept will be implemented....");
	}
	public static void main(String[] args) 
	{
		example1 obj=new example1();
		obj.setMethod(1000.01);
		System.out.println(obj.getMethod());
		obj.msg();
	

	}

}
