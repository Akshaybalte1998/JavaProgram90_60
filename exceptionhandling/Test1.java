package exceptionhandling;

// Throwable class API


public class Test1 {

	public static void main(String[] args) {
		 try { int a=10;
	        int b=0;
	        System.out.println(" ans :"+a/b);
	       }
	       
	       catch (Exception e)
		 {
	    	   //System.out.println(e.getMessage());
	    	   //   byzero (return error message exception)
	    	   
	    	   
	    	   //System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
	    	   //(return error message exception) and rets Name of exception class
	    	   
	    	e.printStackTrace();
	    	//return excepction file name and error message where it occures 
	    	
//	    	java.lang.ArithmeticException: / by zero
//	    	at exceptionhandling.Test1.main(Test1.java:11)
		 }


		


	}

}
