interface Yarea {
	double pi=3.14;
	float x=2;
	double a1=5;
	double b=3;
	}
class Circle implements Yarea{
	public float compute(float x, float y)
	{
		return(pi*x*x);
	}
class cylinder implements Yarea{
	public float compute(double a1, double b)
	{
		return(pi*a1*a1*b);
	}
}
}