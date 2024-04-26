package exceptionhandling;

public class TestCheckedUsingTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("error!!!!");
		}
		System.out.println("After");

	}

}
