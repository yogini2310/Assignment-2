class array{
	public static void main(String args[])
	{
		float[] f= new float[]
		{10.5f, 11.5f, 20.1f, 1.5f, 9.5f, 29.1f, 15.5f, 13.5f, 21.1f, 9.5f, 7.5f};
		double sum=0;

		System.out.println("Your array is:");

		for(int i=0;i<f.length;i++)

		System.out.println("f["+i+"]"+"="+f[i]);
	
		for(int i=0;i<f.length;i++)

		sum=sum+f.length;

		double avg = sum/ f.length;
	
		System.out.println("Sum:"+sum);

		System.out.println("Avg:" + avg);
	}
} 