package pack1;

public class Throws
{
	static void test() throws ArithmeticException
	{
		int i = 10 / 0;
	}
	static void test1() throws ArithmeticException
	{
		test();
	}

	public static void main(String[] args)
	{
		try
		{
			test1();
		} 
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("main");

	}
}
