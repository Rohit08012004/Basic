import java.util.Scanner;
 class loancal {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("       LOAN CALCULATOR ");
		System.out.println();
		System.out.println("ENTER THE AMOUNT");
		int amount= sc.nextInt();
		System.out.println("RATE OF INTEREST");
		int roi= sc.nextInt();
		System.out.println("ENTER THE MONTH");
		int mon=sc.nextInt();

		//cal month to year
		String str=(mon/10)+"."+(mon%12);
		Float con=Float.parseFloat(str);
		

		System.out.println();
		System.out.println("AMOUNT  :"+ amount);
		System.out.println("ROI"+roi+"%");
		System.out.println("Tenure"+mon+"month");

		float intyear=amount*roi/100;
		float totalinter=intyear*con;
	
		System.out.println("INTEREST :"+totalinter);
		

		float outstanding=amount+totalinter;
		System.out.println("TOTAL AMOUNT : "+outstanding);
		System.out.println("Emi"+(outstanding/mon)+"rs");
	}
}