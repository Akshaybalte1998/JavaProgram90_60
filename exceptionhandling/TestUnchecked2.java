package exceptionhandling;

public class TestUnchecked2 {

	public static void main(String[] args) {
     try {
		     String[] name= {"akshay","balte","ajay"};
     
                 System.out.println(name[3]);
     }
    /*  without using try catch block
     Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at exceptionhandling.TestUnchecked2.main(TestUnchecked2.java:8)

     */
    catch(ArrayIndexOutOfBoundsException e)
     {
    	System.out.println("   out of array index");
     }
    
    //  using try catch block 
     // output is :   out of array index

    
	}

}
