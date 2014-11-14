
public class Beetle extends Car
	{
	@Override
	public void makeNoise()
		{
		System.out.println("BRUMMUMMUMUMMMUM");
		}
	@Override
	public void displayInfo()
		{
		name = "Beetle";
		year = 1960;
		System.out.println("name = " + name + "/nyear=" + year + "/ntype = " + getType());
		}
	}
