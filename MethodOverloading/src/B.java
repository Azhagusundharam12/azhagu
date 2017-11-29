public class B
{
	void test()
	{
		System.out.println("test without argument");
	}
	void test(char i)
	{
		System.out.println(i);
		System.out.println("test one argument");
	}
	void test(float i,int j)
	{
		System.out.println("test two argument");
	}
	void test(float i)
	{
		System.out.println("test float argument");
	}

	public static void main(String[] args)
	{
		B b1 = new B();
		b1.test('A');

	}
}
