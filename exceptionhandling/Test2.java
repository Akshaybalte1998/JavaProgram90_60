package exceptionhandling;

public class Test2 {

	public static void main(String[] args) {
   //without static keyword 
		
		Test2 m1 = new Test2();
		m1.testMe("1735617");

	}
	
	
	void  testMe(String s )
	{
		System.out.println("value convert String into intger");
		System.out.println(Integer.parseInt(s));
	}

}
