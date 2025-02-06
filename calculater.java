import java.util.Scanner;

class calculater
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num1");
		int  num1=sc.nextInt();
		
		System.out.println("enter the num2");
		int  num2=sc.nextInt();

		System.out.println("enter the operation");
		char opt=sc.next().charAt(0);
		
		int ans = opt=='+'? num1+num2:
			 opt=='-'? num1-num2:
			opt=='*'? num1*num2:
			opt=='/'? num1/num2:
			opt=='%'? num1%num2:0;
		String output=(num1+" "+opt+" "+num2+" = "+ans);
		

		 if(!(ans == 0.000000f))
		System.out.println(output);
	}
}		

