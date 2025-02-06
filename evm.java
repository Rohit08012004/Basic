import java.util.Scanner;

class evm
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("      WELCOME");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("Enter the no a population");
		int pop= sc.nextInt();

		int bjp=0 ,cng=0,app=0,nota=0;
		
		for(int i=1; i<=pop;i++)
		{
		
		System.out.println("             list of the parties");
		System.out.println("1. BJP");
		System.out.println("2. CNG");
		System.out.println("3. AAP");
		System.out.println("4. NOTA");
		System.out.println();
		System.out.println("Enter the no ");
		int count= sc.nextInt();

		
		if(count==1)
 		 bjp++;
		if(count==2)
 		 cng++;
		if(count==3)
 		 app++;
		if(count==4)
 		 nota++;
		
		

		if(!(count>=1&&count<=4))
		{
		i--;
		System.out.println("invalid input");
		}
		}

		if(bjp>=cng &&  bjp>=app && bjp>=nota  )
		{
		System.out.println("BJP is Winner");
		return;
		}

		if(cng>=bjp &&  cng>=app && cng>=nota  )
		{
		System.out.println("CNG is Winner");
		return;
		}

		if(app>=cng &&  app>=bjp && app>=nota  )
		{
		System.out.println("AAP is Winner");
		return;
		}

		if(nota>=cng &&  nota>=app && nota>=bjp  )
		{
		System.out.println("NOTE is Winner");
		return;
		}

	
		
	}
}