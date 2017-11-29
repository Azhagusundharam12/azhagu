
public class B extends A
{
	void test1()
	{
		System.out.println("test1");
	}

	public static void main(String[] args)
	{
		B b1 = new B();
		System.out.println(b1.i);
		b1.test();
		b1.test1();
	}
}
