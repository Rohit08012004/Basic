import java.util.Scanner;

class productdigit
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the digit no");
		int num=sc.nextInt();
		int product=1;
		System.out.println("the digit is"+ num);

		int x=num%10;
		product=product*x;
		num=num/10;

		 x=num%10;
		product=product*x;
		num=num/10;

		 x=num%10;
		product=product*x;
		num=num/10;
		
		System.out.println("The product of the digit is"+ product);
		
	}
} 