import java.util.Scanner;
class evilno
{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int len=0;
		String bin="";

		for (int i=num;i>0;i/=2)
			bin=(i%2)+bin;

		int cnt=0;

		for (int i=0;i<=bin.length()-1 ;i++ ) 
		{
		  char ch = bin.charAt(i);

		  if(ch=='1')
		  	cnt++;

		}

		if(cnt%2==0)
		    System.out.println(num+"  it is a evil number ");

		else
			System.out.println(num+ "it is not a evil number");





	}
}