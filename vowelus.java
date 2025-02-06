import java.util.Scanner;

class vowelus
{
	public static void main(String [] args)
	{
	 System.out.println("----------TO FIND THE VOWEL FOR USER NAME----------");
		
	Scanner sc=new Scanner (System.in);
	
	System.out.println("ENter the name :");
	String un=sc.next().toUpperCase();
	int len=un.length();

	for (int i=0;i<=len;i++)
	{
	 char ch =un.charAt(i);
		if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
		{
			System.out.println(ch);
		}
	}
	}
}