package akshay;

public class UtilityFruit {

	
	
	public static void DisplayName( Fruit[] basket)
	{
		for(int i=0;i<basket.length;i++)
		{
			System.out.println(basket[i].getName());
		}
	}
	
	public static void displayAllDeatils(Fruit[] basket)
	{
		for(int i=0;i<basket.length;i++)
		{
			System.out.println(basket[i]);
			//System.out.println("name"+basket[i].getName()+"  "+" colour"+basket[i].getCol()+" weight "+basket[i].getWeight()+" taste "+basket[i].taste());
		}
	}
}
