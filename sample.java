class sample{
	public static void main(String args[])throws java.io.IOException{
		int per;
		String grade;
		System.out.println("Enter the percentage");
		per=Integer.parseInt(System.console().readLine());
		if(per>=70)
		  System.out.println("Distintion");

		else if(per>=60 && per<70)

		  System.out.println("First Class");

		else if(per>=50 && per<60)
		  System.out.println("Second Class");

		else if(per>=40 && per<50)
		  System.out.println("Pass Class");

		else
		  System.out.println("Fail");  
	}
}