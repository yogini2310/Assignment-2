class prime{
	public ststic void main(Sting args[]){
		int num,i;
		boolean flag=false;
		System.out.print("Enter the vlue of num");		
		num=Integer.parse(System.console().Readline());
		for(i=2;i<num;i++)
		{
			(num%i==0)
			System.out.println("Number is prime");
			break;
		}
		else
		{
			flag=true;		
		}
		if(flag==true)
		System.out.println("Number is prime");
	} 
}		