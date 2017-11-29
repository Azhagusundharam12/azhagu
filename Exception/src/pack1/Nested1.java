package pack1;

public class Nested1
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("try");
			int j = 10 / 0;
		} catch (ArithmeticException ex)
		{
			System.out.println("catch");
			try
			{
				int i = 10 / 0;
			}
			catch(ArithmeticException ex1)
			{
				
			}
	
		}
		System.out.println("main");
	}
}
