
public class Jet extends Plane
	{
	@Override
	public void makeNoise()
		{
		System.out.println("Zoom!");
		}
	@Override
	public void displayInfo()
		{
		name = "Jet";
		year = 2012;
		System.out.println("name = " + name + "/nyear=" + year + "/ntype = " + getType());
		}
	}
