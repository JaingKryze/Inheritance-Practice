
public class Plane extends Vehicle
	{
	public String getType()
		{
		return "Plane";
		}
	public void makeNoise()
		{
		System.out.println("Zoom!");
		}
	public void move()
		{
		System.out.println("Flies");
		}
	public void displayInfo()
		{
		name = "Plane";
		System.out.println("name = " + name + "/nyear=" + year + "/ntype = " + getType());
		}

	}
