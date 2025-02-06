import java.util.Scanner;

class seasion
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the month");
		String mon=sc.nextLine();
		
		String result=((mon.equals("oct"))||(mon.equals("nov"))||(mon.equals("dec"))||(mon.equals("jan")))?("Winter"):
		((mon.equals("feb"))||(mon.equals("mar"))||(mon.equals("apr"))||(mon.equals("may"))?("Summer"):
		(((mon.equals("jum"))||(mon.equals("jul"))||(mon.equals("aug"))||(mon.equals("sep")))?("monsoon"):("no")));
		System.out.println(result);
	}
}
