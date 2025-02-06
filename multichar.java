import java.util.*;
class multichar
{
	public static void main (String [] args)
	{
 	Scanner sc= new Scanner(System.in);
	
	
	System.out.println("multi of char");
        System.out.print("enter the first value : ");
         char  v1=sc.nextLine().charAt(0);
        
	
	System.out.print("enter the second value");
	char v2= sc.nextLine().charAt(0);
         int v3=v1*v2;
        System.out.print(v3);
         
	
																         
	}
}