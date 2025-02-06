import java.util.Scanner;

class printcal
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int c=sc.nextInt();
		String s=(c%2==0 &&c%5==0)?("hi two five"):((c%2==0)?("hi two"):((c%5==0)?("hifive"):("  ")));
		System.out.println(s);

	}
}