package Employee;

public class Employee {
	
	private int empid;
	private String name;
	private  double salary;
	
	public Employee()
	{
		empid = 0;
		name =" akshay";
		salary = 900000;
		
	}
	
	public Employee(int empid ,String name ,double salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	@Override

	public String toString()
	{
		return  "empid : "+empid+ " name: "+name+" salary: "+salary;
	}
	public int getEmpid()
	{
		return empid;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public void setValue( int empid)
	{
		this.empid=empid;
	}
	
	
	
	
	
	
}
