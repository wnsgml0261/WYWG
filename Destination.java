package WYWG;

public class Destination
{
	// declaring variables
	private String location, country, time;
	private int terminals;
	private String gate;

	// parameterized constructor
	public Destination(String lo, String co, int te, String ga, String ti)
	{
		this.location = lo;
		this.country = co;
		this.time = ti;
		this.terminals = te;
		this.gate = ga;
	}
	
	// @param set the location of your destination
	public void setLocation(String l)
	{
		this.location = l;
	}
	
	// @return the location of your destination
	public String getLocation()
	{
		return location;
	}
	
	// @param set the country of your destination
	public void setCountry(String c)
	{
		this.country = c;
	}
	
	// @return the country of your destination
	public String getCountry()
	{
		return country;
	}
	
	// @param set the arrival time
	public void setTime(String t)
	{
		this.time = t;
	}
	
	// @return the arrival time
	public String getTime()
	{
		return time;
	}
	
	// @param set the terminals in airport
	public void setTerminals(int t)
	{
		this.terminals = t;
	}
	
	// @return the terminals in airport
	public int getTerminals()
	{
		return terminals;
	}
	
	// @param set the gate 
	public void setGate(String g)
	{
		this.gate = g;
	}
	
	// @return the gate
	public String getGate()
	{
		return gate;
	}
	
	// @return the presentation of this destination
	public String toString()
	{
		return ("\nArrives " + country + "\n" + location + 
				"\nTerminal: " + terminals + "\nGate: " + gate + "\nArrival times: "
						+ time);
	}
	
}
