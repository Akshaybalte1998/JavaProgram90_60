package akshay;

public class Orange extends Fruit  {
	public Orange()
	{
		super();
	}
	
	public Orange(String name,double weight,color col)
	{
		super(name,weight,col);
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
	
	@Override
	public String taste()
	{
		return "sour";
		
		
	}
	
	public void juice()
	{
		System.out.println(super.getName()+"extracting juice!");
	}
	
}
