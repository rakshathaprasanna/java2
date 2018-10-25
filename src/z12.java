class z10 
{
	static int i;
	static
	{
System.out.println("z10.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin z10");
	}

}
class z11 
{
	
	static
	{
		System.out.println("z11.SIB");
	}
public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(z10.i); 
		System.out.println("main end");
	}
}
