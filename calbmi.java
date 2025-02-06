import java.util.Scanner;

class calbmi
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("entre weight in pound : ");
 		float we=sc.nextFloat();
		System.out.print("Enter height in inches");
		float he=sc.nextFloat();
		float newwe=we*0.4535f;
		float newhe=he*0.0254f;
		System.out.println("BMI is "+ (newwe/(newhe*newhe)));

	}
}