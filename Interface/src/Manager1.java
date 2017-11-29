public class Manager1
{
	static void callMethod(Vehicle v1)
	{
		v1.cost();
		v1.speed();
	}
	public static void main(String[] args)
	{
		System.out.println("two wheeler");
		TwoWheeler  t1=new TwoWheeler();
		callMethod(t1);
		System.out.println("--------------");
		System.out.println("four wheeler");
		FourWheeler f1=new FourWheeler();
		callMethod(f1);
		
	}
}
