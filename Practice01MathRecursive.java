public class Practice01MathRecursive implements Practice01Math
{

	public int fib(int n)
	{
		if (n<=1)

			return n;
	
		else{
		return fib(n-1)+fib(n-2);}
	}

	public int fact(int n) throws Exception
	{	if (n<0) throw new Exception("invalid argument");
		int output;
		if (n<=1) 
			return 1;	

		return n*fact(n-1);			
	}
}
