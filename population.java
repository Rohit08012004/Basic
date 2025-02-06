class population
{
	public static void main(String [] args)
	{
	 long cp=312031486;
	 long sec=(365*24*60*60)*5;
	 long birth=sec/7;
	 long death=sec/13;
	 long imm=sec/45;
 	 long np=cp+birth-death+imm;
	 System.out.println("current population : "+ np);
	}
}