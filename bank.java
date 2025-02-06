import java.util.Scanner;
class bank
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		String usname=null;
		String password=null;
		String address=null;
		double balance=0.0;
		long phoneno=0;
		
		for(;;)
		{
			System.out.println("-------WELCOME--------");
			System.out.println();
			System.out.println(" children bank ");
			System.out.println();
			System.out.println("1. EXEISTING ACCOUNT");
			System.out.println("2. CREATE ACCOUNT");
			System.out.println();
			System.out.println("Enter an option :");
			int opt=sc.nextInt();
			System.out.println();

			if(opt==1)
			{
				if(usname==null)
				{
				System.out.println("FIRST CREATE YOUR ACCOUNT");
				continue;
				}
				
				System.out.println("     LOGIN    ");
			        System.out.println();

				for(int i=3; i>0;i++)
				{	
					System.out.print("enter the username :");
					String usname1=sc.next();
					System.out.println("password :");
					String password1=sc.next();
			
					if(usname1.equals(usname) && password1.equals(password))
					{
						home:
						for(;;){
						System.out.println("-----home page----  ");
						System.out.println();
						System.out.println("1.DEPOSIT");
						System.out.println("2. WITHDRAW");
						System.out.println("3. CHEAK BALANCE");
						System.out.println("4. MINI STTEMNT");		
						System.out.println("enter the option : ");
						int opt1=sc.nextInt();

						switch(opt1)
						{
						      case 1:{
								System.out.println("DEPOSIT");
								System.out.println();
							
								System.out.println("Enter the amount :");
								double depami=sc.nextDouble();
								balance +=depami;
								System.out.println("AMOUNT DEPOSITED SUCCESS");
								System.out.println();
								break;
							      }
							case 2:{
								
								System.out.println(" WITHDRAW");
								System.out.println();
								
								System.out.println("ENTER THE AMOUNT :");
								double withdraw=sc.nextDouble();

								System.out.println("ENTER THE PIN  :");
								String password2=sc.next();

								if(password2.equals(password))
									{
										if (withdraw <=balance)
										{
											balance -=withdraw;
											System.out.println("WITHDRAW SUCCESS");
										}
										else
										{
											System.out.println("INSUFFICINT FUNDS");
										}
			
									}
									else
									{
										System.out.println("wrong pin");
									}
									break;
								}
							case 3:{
								System.out.println("CHEAK BALANCE");
								System.out.println();
									
								for(int j=3;j>=1;j--)
								{
									System.out.println("password :");
									String password3=sc.next();
			
										if(password3.equals(password))
										{
											System.out.println("ACCOUNT BALANCE "+ balance +"rs");
											continue home;
										}

										else
										{
											System.out.println("WRONG PIN");
											System.out.println("ATTEMPT LEFT :"+(j-1));
										}
								}
								 System.out.println("your account has been blocked for 24 hours");
								 System.exit(0);
									break;
								}
 
						  	case 4:{
									System.out.println("mini statement");
									break;
								}	
								
							case 5:{
								System.out.println("THANK YOU FOR USING OUR APP");
								System.out.println("visit again..");
								System.exit(0);
									break;
								}
							
												
								
							}
						}

				

					}
					else
{
						System.out.println("INVALID CRED");
						System.out.println("Attempt"+ (i-1));
					}

				}

				
				
			}
			else if(opt==2)
			{
			System.out.println();
			System.out.println("CREATE ACCOUNT");

			System.out.println("USER NAME :");
			usname=sc.next();
			System.out.println("PASSWORD :");
			password=sc.next();
			sc.nextLine();
			System.out.println("ADDRESS : ");
			address=sc.nextLine();
			System.out.println("CONTACT :");
			phoneno=sc.nextLong();
			System.out.println("DEPOSIT AMOUNT :");
			balance=sc.nextDouble();
			System.out.println();
			System.out.println("ACCOUNT IS CREATED SUCCESS");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("----------------------------------");

			}

			else{
				System.out.println("in valid input");
			}
			
		}
		
	}
}