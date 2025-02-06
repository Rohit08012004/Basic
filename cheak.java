import java.util.Scanner;

class cheak
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the leter");
		char c=sc.next().charAt(0);
		String s=((c>='A' && c <='Z')||(c>='a' && c <='z'))?
		(((c>='a' && c <='z'))?(c+ " lowecase"):(c+" upper case")):
		((c>='0' && c <='9')?(c+" digit"):(c+" special character"));	
		System.out.println(s);
	}
}