import java.util.Scanner;

class uppercase
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the leter");
		char c=sc.next().charAt(0);
		String s=(c>='A' && c <='Z')?("It is a uppercase"):
					("It is not a uppercase");	
		System.out.println(s);
	}
}