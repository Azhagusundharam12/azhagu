package pack1;

public class AgeNotNegativeException extends RuntimeException
{
	String s1 = "pls enter the valid age";

	@Override
	public String toString()
	{
		return s1;
	}

	@Override
	public String getMessage()
	{
		super.getMessage();
		return s1;
	}
}
