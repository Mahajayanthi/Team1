package java8;

import javax.sound.midi.SysexMessage;

@FunctionalInterface
interface Testing {
	public int number(int n);
	//public Static void number1(int n);

	//public int number1(int n);
	//public void set();
}

public class LambdaExamples {
	public static void main(String[] args)
	{
		
		//before Lambda
		
		/*
		 * Testing b=new Testing() {
		 * 
		 * @Override public int number(int n) { return n*2; }
		 * 
		 * };
		 * 
		 * System.out.println(b.number(5));
		 */
		
		//after lambda
		
		
		  Testing a =n->n*2; System.out.println(a.number(5));
		  
		 

	
	}

}
