package WYWG;

public class AirLine {
	// declaring variable
	private String name;
	private int number;
	
	// parameterized constructor
	public AirLine(String n, int num)
	{
		this.name = n;
		this.number = num;
	}
	
	// @param the name of air line
	public void setName(String na)
	{
		this.name = na;
	}
	
	// @return the name of air line
	public String getName()
	{
		return name;
	}
	
	// @param set the how many air plane in this air line
	public void setNumber(int n)
	{
		this.number = n;
	}
	
	// @return the how many air plane in this air line
	public int getNumber()
	{
		return number;
	}
	
	// @return the presentation of this air line
	public String toString()
	{
		return ("Welcome to " + name + "! we have " + number + " airplane to flight from JFK.");
	}
}
