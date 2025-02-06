import java.util.Scanner;
class loopsum
{
	public static void main(String [] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the no :");
	int num=sc.nextInt();
	int sum=0;

	while(num>0)
	{
		
		int rem=num%10;
		if(num%2==0){
		sum+=rem;
		}
		num/=10;
		
	}
	System.out.println("ADDITION OF EVEN NO");
	System.out.println(sum); 
	}
}