class test
{
	static int fib(int n)
	{
		if(n<2) return 1;
		else return fib(n-1) + fib(n-2);
		
	}
	public static void main(String a[])
	{
		for(int i=0; i<10; i++)
		{
			System.out.println(fib(i) + ",");
		}
	}
}