import java.util.Scanner ;

class potokg
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of pounds: ");
		float po=sc.nextFloat();
		System.out.println(po +"pounds is "+(po*0.454) + "kilograms");
	}

}