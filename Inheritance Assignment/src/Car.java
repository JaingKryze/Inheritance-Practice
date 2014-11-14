
public class Car extends Vehicle
	{
	public String getType()
		{
		return "Car";
		}
	public void makeNoise()
		{
		System.out.println("Honk");
		}
	public void move()
		{
		System.out.println("Drives");
		}
	public void displayInfo()
		{
		name = "Car";
		System.out.println("name = " + name + "/nyear=" + year + "/ntype = " + getType());
		}
	}
