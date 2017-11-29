
public class Default1
{
	public Default1()
	{
		System.out.println("no arg");
	}
	public Default1(int i)
	{
		System.out.println("one arg");
	}
	public static void main(String[] args)
	{
		Default1 d1=new Default1();
	    Default1 d2=new Default1(78);
	}
}
