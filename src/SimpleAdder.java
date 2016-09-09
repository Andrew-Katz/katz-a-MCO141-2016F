
import java.util.Scanner;

public class SimpleAdder 
{
	public static void main(String args[])
	{
		int i1 = 0;
		int i2 = 0;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter first term");
		try
		{
			i1 = read.nextInt();
			System.out.println("I got " + i1 + " now eneter the second term");
			i2 = read.nextInt();
			System.out.println("the sum of " + i1 + " and " + i2 + " = " + i1 + i2);
			int sum = i1 + i2;
			System.out.println("the sum of " + i1 + " and " + i2 + " = " + sum);
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return;
	}
}
