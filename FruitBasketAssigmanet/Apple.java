package akshay;

public class Apple extends Fruit {

	
	public  Apple()
	{
		super();
	}
	public Apple( String name,double weight ,color col)
	{
		 super(name, weight, col);
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
	@Override
	public String taste()
	{
		return "sweet ann sour"; 
	}
	public void jam() 
	{
		
		System.out.println(super.getName()+" making jam!");
	}


	
}
