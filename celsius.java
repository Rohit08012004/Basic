import java.util.Scanner;

class celsius
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the degree in celsius: ");
		double cel=sc.nextDouble();
 		double fah=(1.8*cel)+32;
		System.out.print(cel+"celsius is"+fah+"fahrenheit");
	}
}