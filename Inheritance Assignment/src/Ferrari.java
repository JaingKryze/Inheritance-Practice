
public class Ferrari extends Car
	{
	@Override
	public void makeNoise()
		{
		System.out.println("Vroom");
		}
	@Override
	public void displayInfo()
		{
		name = "Ferrari";
		year = 1989;
		System.out.println("name = " + name + "/nyear=" + year + "/ntype = " + getType());
		}
	}
