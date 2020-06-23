package WYWG;

public class AirPlane extends AirLine
{
	// declaring variables
	private int mile;
	private double cost;
	
	// constructor
	public AirPlane(){
	}
	
	/* parameterized constructor
	 * @Override
	 */
	public AirPlane(String name, int num, int m, double c)
	{
		super(name, num);
		this.mile = m;
		this.cost = c;
	}
	
	// @param set the miles that you will trip.
	public void setMile(int mi)
	{
		this.mile = mi;
	}
	
	// @return the miles that you will trip.
	public int getMile()
	{
		return mile;
	}
	
	// @param set the price of flight ticket
	public void setCost(int co)
	{
		this.cost = co;
	}
	
	// @return the price of flight ticket
	public double getCost()
	{
		return cost;
	}
	
	/*
	 * @return the presentation of this airplane
	 * @Override
	 */
	public String toString()
	{
		return ("\nTrip mile: " + mile + " mile." + "\nThe cost is $" + cost + ".");
	}
}
