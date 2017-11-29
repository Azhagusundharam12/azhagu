package example;

public class Manager
{
	public static void main(String[] args)
	{
		SBI s1=new SBI();
		//int r1=s1.getROI();
		System.out.println("roi from Sbi="+s1.getROI());
		HDFC h1=new HDFC();
		System.out.println("roi from hdfc="+h1.getROI());
		CITI c1=new CITI();
		System.out.println("roi from citi="+c1.getROI());
	}
}
