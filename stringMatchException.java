import java.io.*;
import java.lang.*;

class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}
class stringMatchException{
	DataInputStream in=new DataInputStream(System.in);
	String s1=new String();
	String s2=new String();
	try{
		System.out.println("Enter String one");
		s1.readline();
		System.out.println("Enter String two);
		s2.readline();

		if(s1.equal(s2)){
			System.out.println("Both String are same");
		}
		else{
			throw new MyException("no match Exception");
		}
	}
	catch(MyException e){
		System.out.println(e);
		}
	catch(IOException e){
		System.out.println(e);
	}
}