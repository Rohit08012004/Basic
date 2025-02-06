import java.util.Scanner;

class sumofevenodd
{
	public static void main(String [] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the 4 digit no");
	int num= sc.nextInt();
	int rem=0;
	int out=0;
	int even=0;
	int odd=0;
	 
	 rem = num%10;
	out=(rem%2==0)?(even=even+rem):(odd= odd+rem);
	num =num/10;

	 rem = num%10;
	out=(rem%2==0)?(even=even+rem):(odd= odd+rem);
	num =num/10;

	 rem = num%10;
	out=(rem%2==0)?(even=even+rem):(odd= odd+rem);
	num =num/10;

	 rem = num%10;
	out=(rem%2==0)?(even=even+rem):(odd= odd+rem);
	num =num/10;

	
	System.out.println("Sum of even"+ even);
	System.out.println("Sum of odd"+ odd);

			
	}
}