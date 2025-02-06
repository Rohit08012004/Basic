import java.util.Scanner;
class oodeven
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int num= sc.nextInt();
		

		System.out.print((num/2)*2==num);
	}
}
