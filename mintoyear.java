import java.util.Scanner;
class mintoyear
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);	
		System.out.println("Enter the number in min");
		long min=sc.nextLong();
		
		long hou=min/60;
		long day=hou/24;
		long year=day/365;
		long leftdays=day%365;

		System.out.println(min +"min is approximately " + year+"year and "+leftdays+"days");
	}
}