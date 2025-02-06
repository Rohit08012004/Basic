import java.util.Scanner;

class loopname 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name :");
		String un=sc.next().toUpperCase();
		int len=un.length();
		

		for (int i=0;i<len;i++)
		{
		System.out.print(un.charAt(i));
		}
	
	}
}