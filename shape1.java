 class circle
 {
    	double rad;
	double a;
	double area()
        {
	  double pi=3.1416;
	  a=pi*rad*rad;
	  return a;
	}
	void get_radius(double r)
	{
		rad=r;
	}
}
class rectangle
{
	double hight,width;
	void get_data(double h,double w)
	{
		hight=h;
		width=w;
	}
	double area()
	 {
		return hight*width;
	 }
class shape
{
	public static void main(String args[])
	 {
	    double result;
	    circle c=new circle();
	    c.get_radius(3.25);
	    result=c.area();
	    System.out.println("area of circle="+result);
	}
}	