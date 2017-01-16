class Test
{
	float a;
	int m1;
	int m2;
	int m3;
	
	Test()
	{
		m1=10;
		m2=20;
		m3=30;
		System.out.println("Result=" + m1+" " + m2+" " + m3);
	}   
public void Avg()
{
	a=(m1+m2+m3)/3;
	System.out.println("Avg of Student="+a);
}
}
class Student
{
	public static void main(String args[])
	{
		Test t=new Test();
		t.Avg();
		
	}
}
