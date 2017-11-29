package pack1;

public class E
{
	
public static void main(String[] args)
{
	System.out.println("main1");
	try
	{
		System.out.println("try");
		int i = 10 / 0;
	} 
	//int i=90;//unreachable stmt
	catch (ArithmeticException ex)
	{
	   int i=20;
		System.out.println("catch");
	}
	System.out.println("main2");
}
}
