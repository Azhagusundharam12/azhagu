public class C 
{
	static void method(Object obj)
	{
		A a2=(A)obj;
		if(obj instanceof A)
		{
			System.out.println("yes");
		}
		a2.test();
	}
	public static void main(String[] args)
	{
		//A a1=new A();
		method(new A());
	}
}
