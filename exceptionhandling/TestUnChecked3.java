package exceptionhandling;

public class TestUnChecked3 {

	public static void main(String[] args) {

	try {
				String s="pritesh";
	
				System.out.println(s.length());//7
				s=null;
				System.out.println(s.length());
	}
	//without using try catch block
	//Exception in thread "main" java.lang.NullPointerException
	//at exceptionhandling.TestUnChecked3.main(TestUnChecked3.java:10)
	catch(NullPointerException e)
	{
		System.out.println(" invalid");
	}
	
	}

	//using try catch block 
	//output: 7 invalid
}
