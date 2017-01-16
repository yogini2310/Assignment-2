import java.io.*;
import java.lang.*;

class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}
class MinorException{
	public static void main(String args[]){

		try{
			if(int n<18){
				throw new MyException("Minor");
			}
			else{
				System.out.println("Major");
			}
		}
		catch(MyException e){
			System.out.println(e);
		}
		
	}
}
			