package MyPack3;
import java.util.Scanner;
public class MultipleCatch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		int arr[];
		arr=new int[2];
		System.out.println("Enter value for a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		
		try
		{
			arr[0]=10;
			arr[1]=arr[1]/2;
			//arr[1]=arr[5]/2;
			c=a/b;
			System.out.println("Division="+c);
			c=a+b;
			System.out.println("Addition="+c);
			System.out.println("Try Run complete");
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Invalid Number");
			System.out.println("Not Divisible by 0"+obj);
		}
		catch(ArrayIndexOutOfBoundsException obj1)
		{
			System.out.println("ArrayIndexOutOfBounds"+obj1);
		}
	}

}
