import java.util.*;
 class addofstring
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number between 0 to 1000");
		int num= sc.nextInt();
		

		int a=num%10;
		num=num/10;
		int b=num%10;
		num=num/10;
		int c=num%10;
		num=num/10;
		System.out.print("The sum of the digit is: "+ (a+b+c));
	}
}