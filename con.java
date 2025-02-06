import java.util.Scanner;
class con
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("    WELCOME");
		System.out.println();
		System.out.println("ENTER THE AMOUT IN (INR) :");
		float inr=sc.nextFloat();
		System.out.println();
		System.out.println("1. USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");
		System.out.println("ENTRE THE CURRENCY");
		String sel=sc.next().toUpperCase();
		
		if(sel.equals("USD")){
		System.out.println(inr+"INR = "+(inr/86.56f)+"USD" );

			}
		else if(sel.equals("EUR")){
		System.out.println(inr+"INR = "+(inr*0.011f)+"EUR" );
			}

		else if(sel.equals("GBP")){
		System.out.println(inr+"INR = "+(inr*0.0093f)+"GBP" );
			}

		if(sel.equals("PKR")){
		System.out.println(inr+"INR = "+(inr*3.23f)+"PKS" );
			}
		else
		System.out.println("INVALID");

	}
}