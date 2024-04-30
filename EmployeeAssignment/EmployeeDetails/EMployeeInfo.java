package employee;

public class EMployeeInfo {
	
	private int id;
	private String name;
	private int  rollNumber;
	
	public EMployeeInfo()
	{
		id=0;
		name="xxx";
		rollNumber=0;
	}
	public EMployeeInfo( int id ,String name,int rollNumber)
	{
		this.id=id;
		this.name=name;
		this.rollNumber=rollNumber;
	}
	@Override
	public String toString()
	{
		return "id: "+id+" name :"+name+"  rollNumber: "+rollNumber;
	}
	public int getID()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getRollNumber()
	{
		return rollNumber;
	}

	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setRollNumber(int rollNumber)
	{
		this.rollNumber=rollNumber;
	}
	
	
}
