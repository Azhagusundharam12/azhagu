public class B extends Thread
{
	
	@Override
	public void run()
	{
		for (int i = 0; i < 2000; i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		B b1 = new B();
		b1.start();
		//b1.start();
		for (int i = 2000; i < 4000; i++)
		{
			System.out.println(i);
		}
	}
}
