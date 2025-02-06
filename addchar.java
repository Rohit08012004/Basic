import java.util.*;
class addchar
{
	public static void main (String [] args)
	{
 	Scanner sc= new Scanner(System.in);
    
	
	{
	System.out.println("addition of char");
        System.out.print("enter the first value : ");	
         char  v1=sc.nextLine().charAt(0);
        
	
	System.out.println("enter the second value");
	char v2= sc.nextLine().charAt(0);
         int v3=v1+v2;
        System.out.print(v3);
        } 
	

	{
	System.out.println("addition of string");
        System.out.print("enter the first value : ");
         String v1=sc.nextLine();
   
	
	System.out.println("enter the second value");
	String v2= sc.nextLine();
         String v3=v1+v2;
        System.out.print(v3);
        } 


	}
}