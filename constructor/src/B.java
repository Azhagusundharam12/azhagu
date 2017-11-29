public class B
{
	public B()
	{
		System.out.println("cons1");
	}

	public B(int i)
	{
		System.out.println("cons2");
	}

	public static void main(String[] args)
	{
		B b1 = new B();
		B b2 = new B(12);
		System.out.println("main");
	}
}
