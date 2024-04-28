package akshay;

public class Mango extends Fruit 
{
// public void pulp() {Display name n color of the fruit + a mesg  creating  pulp!}   sweet
	
	
	
	public Mango()
	{
		super();
	}
	public Mango(String name,double weight,color col)
	{
		super(name,weight,col);
		
	}
	
	@Override
	public String taste()
	{
		return "sweet";
	}
	
	@Override
	public String toString()
	{
		return super.toString();	
	}
	
	public  void pulp()
	{
		System.out.println(super.getName()+"creating pulp");
	}




}
