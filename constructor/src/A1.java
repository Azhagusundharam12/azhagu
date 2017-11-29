public class A1
{

	int i=10;
	public A1()
	{
		System.out.println("cons2");
	}
	public static void main(String[] args)
	{
		A1 a1=new A1();
		a1.i=20;
		A1 a2=new A1();
		A1 a3=a2;
		a3.i=30;
		System.out.println("main");
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
	}
}
