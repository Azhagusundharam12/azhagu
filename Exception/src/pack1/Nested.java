package pack1;

public class Nested
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("try");
			try
			{
				int i = 10 / 7;
			} catch (ArithmeticException ex1)
			{
				System.out.println("catch");
			}
			int j = 10 / 0;
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch1");
		}
		System.out.println("main");
	}

}
