import java.util.Scanner;


class perimetercircle
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the radius: ");
		int r=sc.nextInt();
		System.out.print("the perimeter of the circle: "+ 2*(22.0/7)*r);
	}

}