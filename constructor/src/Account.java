public class Account
{
	int accNo;
	int age;
	public Account(int accNo,int age)
	{
		this.accNo=accNo;
		this.age=age;
	}
	public static void main(String[] args)
	{
		Account a1=new Account(123, 23);
		Account a2=new Account(124, 30);
		System.out.println("customer1:AccNo="+a1.accNo+",Age="+a1.age);
		System.out.println("customer2:AccNo="+a2.accNo+",Age="+a2.age);
	}
}
