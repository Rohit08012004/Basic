import java.util.*;
 class cylinder
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("Entert the radius or height of the cyinder");
		float r=sc.nextFloat();
		float h=sc.nextFloat();
  		float area= (22.0f/7f)*r*r;
 		System.out.print("Area of the cylinder"+ area);
		float volume=area*h;
		System.out.print("Volume of the cylinder"+volume);
	}
}