public class Practice01MathIterative implements Practice01Math {

	public int fib(int n) throws Exception
	{ 	if (n<=1)
			return n;
		int fib=1;
		int prevFib = 1;
		for (int i=2; i<n; i++)
		{	int x = fib;
			fib+=prevFib;
			prevFib=x;
		}
		return fib;
	}

	public int fact(int n) throws Exception
	{   if (n<0) throw new Exception("Invalid argument");
		int total = 1;
		for (int i=1; i<n; i++)
		
			total=total*(i+1);
		
		return total;
	}
		

}