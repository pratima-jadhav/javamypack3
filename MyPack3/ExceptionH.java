package MyPack3;
import java.util.Scanner;
public class ExceptionH 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0,d;
		System.out.println("Enter value for a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		
		try
		{
			c=a+b;
			System.out.println("Addition="+c);
			c=a-b;
			System.out.println("Subtraction="+c);
			c=a/b;
			System.out.println("Division="+c);
			System.out.println("Try Run complete");
		}
		catch(Exception obj)
		{
			System.out.println("Invalid Number");
			System.out.println("Not Divisible by 0"+obj);
		}
		finally
		{
			d=a+b+c;
			System.out.println("All Addition:"+d);
		}
	}
}
