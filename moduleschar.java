import java.util.*;
class moduleschar
{
	public static void main (String [] args)
	{
 	Scanner sc= new Scanner(System.in);
	
	
	System.out.println("modules of char");
        System.out.print("enter the first value : ");
         char  v1=sc.nextLine().charAt(0);
        
	
	System.out.print("enter the second value");
	char v2= sc.nextLine().charAt(0);
         double v3=v1%v2;
        System.out.print(v3);
         
	
																         
	}
}