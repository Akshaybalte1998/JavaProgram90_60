package akshay;

public abstract class Fruit {
	private String name;
	private double weight;
	private color col;
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public color getCol() {
		return col;
	}

	public void setCol(color col) {
		this.col = col;
	}

	public  Fruit()
	{
		name="aks";
		weight=0.00;
	      col=color.nocolour;
	} 
	
	public  Fruit( String name,double weight ,color col)
	{
		this.name=name;
		this.weight=weight;
		this.col=col;
	}
	
	public String taste()
	{
		return "no specific taste"; 
	}
	
	@Override
	public String toString()
	{
		return "name: "+this.name+
				"weight: "+this.weight+
				"colour :"+this.col;
		
	}




	
	
	
	
}
