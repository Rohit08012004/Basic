import java.util.Scanner;

class vowel
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the leter");
		char c=sc.next().charAt(0);
		String s=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')?
		("It is a vowel"):
		("It is not a vowel");	
		System.out.println(s);
	}
}