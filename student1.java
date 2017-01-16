class Test
{
	static int m1,m2,m3;
	static float a;
	static void trac(int m1, int m2, int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;	
	System.out.println("m1="+m1+" "+"m2="+m2+" "+"m3="+m3);
	}
	static void avg()
	{
		a=(m1+m2+m3)/3;
		System.out.println("Avg of marks is="+a);
	}
}
class student1
{
	public static void main(String args[])
	{
		Test.trac(20,30,50);
		Test.avg();
	}
}
