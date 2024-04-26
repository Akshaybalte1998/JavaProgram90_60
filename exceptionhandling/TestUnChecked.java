package exceptionhandling;

public class TestUnChecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try { int a=10;
        int b=0;
        System.out.println(" ans :"+a/b);
       }
       
       
       catch(ArithmeticException e)
       {
    	   System.out.println(" enter the correct value");
       }
	}

}
