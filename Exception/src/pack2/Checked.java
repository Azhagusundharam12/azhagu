package pack2;

import java.sql.SQLException;

public class Checked
{
	public static void main(String[] args)
	{

		try
		{
			Thread.sleep(1000);
		} catch (Exception e)
		{

			e.printStackTrace();
		}
		System.out.println("main");
	}
}
