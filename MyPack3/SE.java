package MyPack3;
import java.util.Scanner;
public class SE extends FE
{
		Scanner sc= new Scanner(System.in);
		
		private
		int m1,m2,m3,tot2,total;
		float per;
		String name;
		public
		    void get_()
		    {
			super.get();
			System.out.println("............. SE marks.........");
			System.out.println("enter sub 1 marks");
			m1=sc.nextInt();
			System.out.println("enter sub 2 marks");
			m2=sc.nextInt();
			System.out.println("enter sub 3 marks");
			m3=sc.nextInt();
		    }
		
			void process_()
			{	
			super.process();
			tot2=m1+m2+m3;
			total=tot1+tot2;
			per=total/6;
			System.out.println("SE sub 1 marks= "+m1);
			System.out.println("SE sub 2 marks= "+m2);
			System.out.println("SE sub 3 marks= "+m3);
			System.out.println("====================================");
			System.out.println("SE Total= "+tot2);
			System.out.println("====================================");
			System.out.println("Final Total= "+total);
			System.out.println("Percentage= "+per);			
		}
}
