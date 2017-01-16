class overloaddemo{
	void test()
		{
		System.out.println("No parameter");
		}
	void test(int a)
		{
		System.out.println("a:"+a);
		}
	void test(int a,int b)
		{
		System.out.println("a+b:"+a+" "+b);
		}
	double test(double a)
		{
		System.out.println("double a:"+a);
		return a*a;
		}
	}
	class overload
	{
		public static void main(String args[])
		{
			overloaddemo ab=new overloaddemo();
			double result;
			ob.test();
			ob.test(10);
			ob.test(10,20);
			results=ob.test(123.25);
			System.out,println("Result of ob.test (123.25):" +result);
		}
	}