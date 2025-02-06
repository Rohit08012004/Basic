import java.util.*;


class tip
{
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the Subtotal");
		int a= sc.nextInt();
		System.out.print("and the tip rate");
		float b= sc.nextFloat();
		float c=a*(b/100);
		System.out.print("The tip is "+c+"and total is"+ (a+c));
	}
}