package pack1;

public class Finally1
{
public static void main(String[] args)
{
	try
	{
		System.out.println("try");
		int i=10/0;
		System.exit(0);
	}
	
	finally
	{
		System.out.println("finally");
	}
	System.out.println("done");
}
}
