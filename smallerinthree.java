class smallerinthree
{
	public static void main (String [] args)
	{
		int a=12;
		int b=23;
		int c=45;
		int small=((a<b))?( (a<b)?(a):(b)):((a<c)?(a):(c));
		System.out.println(small);
	}
}