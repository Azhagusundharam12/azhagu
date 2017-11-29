package pack1;

public class D
{
	public static void main(String[] args)
	{
		System.out.println("main1");
		try
		{
			
			int i = 10 / 0;
			try
			{
				int j =90/0;
			} catch (ArithmeticException e)
			{
				
			}

		} 
		catch (ArithmeticException ex)
		{
			System.out.println("catch2");
			try
			{
				int j =90/0;
			} catch (ArithmeticException e)
			{
				
			}

		}
		System.out.println("main2");

	}
}
