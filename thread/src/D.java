
public class D extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 2000; i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		C c1=new C();
		c1.setDaemon(true);
		c1.start();
		c1.join();
		for (int i = 10; i < 20; i++)
		{
			System.out.println(i);
		}
	}
}
