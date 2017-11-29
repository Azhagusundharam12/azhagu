import java.util.Scanner;
public class Login
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the username");
	String un=sc.next();
	System.out.println("enter the password");
	String pw=sc.next();
	System.out.println("your username is:"+un);
	System.out.println("your password is:"+pw);
	if("abc".equals(un)&&"xyz".equals(pw))
	{
	System.out.println("your login is success!");
	}
	else
	{
		System.out.println("your login is failed!");
	}
}
}
