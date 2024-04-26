package exceptionhandling;

public class nonStaticMethodCall {

	public static void main(String[] args) {
 //without static keyword 
//calling using statics		
		nonStaticMethodCall m1 = new nonStaticMethodCall();
		m1.testMe("1735617");

	}
	
	
	void  testMe(String s )
	{
		System.out.println("value convert String into intger");
		System.out.println(Integer.parseInt(s));
	}


	}


