class largerinfour
{
	public static void main (String [] args)
	{
		int a=69;
		int b=96;
		int c=66;
		int d=99;
		int lar= (a>b)?  ((a>c)? ((a>d) ?(a):(d) ):( (c>d)?(c):(d)) ): ((b>c)? ((b>d)?(b):(d)):( (c>d)?(c):(d))); 
		System.out.println(lar);
	}
}