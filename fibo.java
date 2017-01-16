class fibo{
	public static void main(String args[]){
		int f=1, f1=0, f2=1, f3;
		System.out.print(f1+" "+f2);
		while (f<=13)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			f++;
			System.out.print(" "+f3);
		}
	}
}
	