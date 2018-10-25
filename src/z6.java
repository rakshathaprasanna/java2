class z4 
{
	static int i;
	static
	{
		int i =10;
		System.out.println("z4.SIB" +i);
		System.out.println("z4.SIB" +z4.i);
		i=20;
		z4.i=200;

	}
}
	class z5
	{
		static
		{
System.out.println("z5.SIB");
		}

	public static void main(String[] args) 
	{
		System.out.println("MAIN BEGIN");
		System.out.println(z4.i);
		z4.i=300;
		System.out.println("............");
		System.out.println(z4.i);
		z4.i +=300;
		System.out.println("............");
		System.out.println(z4.i);

			System.out.println("main end");


	}
}
