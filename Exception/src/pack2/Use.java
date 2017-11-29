package pack2;

public class Use
{
	static void test() throws InterruptedException
	{
		
			Thread.sleep(100);
	
	}
	static void test1() throws ClassNotFoundException
	{
	
			Class.forName("pack1.A");
		
	}
	public static void main(String[] args)
	{
		try
		{
			test();
			test1();
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		
	}
}
