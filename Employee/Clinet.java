package Employee;

public class Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp;
		emp =new Employee();
		
		String detail = emp.toString();
	    System.out.println("Details: "+detail);	//Details: empid : 0 name:  akshay salary: 900000.0
	    
	    
	    Employee emp2 =new Employee(2,"ashu",28000);
	    String GivenDetails = emp2.toString();
	    System.out.println("Given details "+GivenDetails);//Given details empid : 2 name: ashu salary: 28000.0
	    
	    
	    
	    
	    
	    System.out.println("get value using getter  : "+emp2.getEmpid());  //get value using getter  : 2
	    
	   

	    System.out.println("get value using getter  : "+emp2.getName());  //get value using getter  : ashu
	    System.out.println("get value using getter  : "+emp2.getSalary()); // get value using getter  : 28000.0
	    
	    emp2.setValue(6);
	    System.out.println(" get value of emp2 after set new value: "+emp2.getEmpid());   //get value of emp2 after set new value: 6
	}

}
