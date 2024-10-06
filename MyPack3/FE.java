package MyPack3;
import java.util.Scanner;
public class FE 
{
		Scanner sc= new Scanner(System.in);
		private
		int roll,s1,s2,s3;
		String name;
		protected int tot1;
		public
		
		void get()
		{
			System.out.println(".............student info.........");
			System.out.println("Enter name = ");
			name=sc.next();
			System.out.println("Enter roll no = ");
			roll=sc.nextInt();
			System.out.println("====================================");
			System.out.println("............. FE marks.........");
			System.out.println("Enter sub 1 marks");
			s1=sc.nextInt();
			System.out.println("Enter sub 2 marks");
			s2=sc.nextInt();
			System.out.println("Enter sub 3 marks");
			s3=sc.nextInt();
		}
		void process()
		{
			tot1=s1+s2+s3;
			System.out.println("Name= "+name);
			System.out.println("Rollno= "+roll);
			System.out.println("====================================");
			System.out.println("FE Sub 1 Marks= "+s1);
			System.out.println("FE Sub 2 Marks= "+s2);
			System.out.println("FE Sub 3 Marks= "+s3);
			System.out.println("====================================");
			System.out.println("Total FE marks= "+tot1);
			System.out.println("====================================");
		}

}
