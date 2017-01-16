 class circle
 {
    	double rad;
	double a;
	
	//circle() {}
	circle(double r)
        {
		rad=r;
	}
	double area()
	{
		double pi=3.1416;
		a=pi*rad*rad;
		return a;
	}
}

class shape2
{
	public static void main(String args[])
	 {
	    double result;
	    //circle C=new circle();
	    circle C1=new circle(10.5);
	    result=C1.area();
	    System.out.println("area of circle="+result);
	}
}

//comment portion is showing that related each other