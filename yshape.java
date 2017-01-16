class shape{
	void over(int l, int b,int h){
	double area=l*b*h;	
	System.out.println("rectangle:"+area);
	}
	void over(int x){
		double area1=x*x*x;
		System.out.println("Cube:"+area1);
	}
	void over(int r, double h,double pi){
		double area2=pi*r*r*h;
		System.out.println("cylinder:"+area2);
	}
}
class yshape{
	public static void main(String args[]){
		shape o=new shape();
		o.over(2,3,4);
		o.over(4);
		o.over(1,2.6,3.1416);
	}
}