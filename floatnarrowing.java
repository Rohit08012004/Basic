class  floatnarrowing
{
 	public static void main(String [] args)
	{
		
		

		float a=100;

		long c=(long)a;
		System.out.println(c); //100

		int d=(int)a;
		System.out.println(d); //100

		char e=(char)a;
		System.out.println(e); //d

		short f=(short)a;
		System.out.println(f); //100  


		byte g=(byte)a;
		System.out.println(g); //100
	}
}