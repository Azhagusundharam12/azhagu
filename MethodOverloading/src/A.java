public class A
{

	void test()
	{
		System.out.println("without arg");
	}
	
	void test(int i)
	{
		System.out.println("one int arg");
	}
	void test(int i,int j)
	{
		System.out.println("two int arg");
	}
	void test(double i)
	{
		System.out.println("double arg");
	}
	public static void main(String[] args)
	{
		A a1=new A();
		a1.test(12.78);
	}
	
}
