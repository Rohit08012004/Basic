import java.util.Scanner;

class result
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=sc.nextInt();
		System.out.println("enter the total marks");
		int total=sc.nextInt();
		double result=(marks*100)/total;
		String r=(result>=35)?("pass"):("fail");
		System.out.println(r);

	}

}
