package WYWG;

public class Departs extends Destination{
	
	/* parameterized constructor
	 * @Override
	 */
	public Departs(String location, String country, int terminals, String gate, String time)
	{
		super(location, country, terminals, gate, time);
	}

	/*
	 *	@return the representation of this departs
	 * 	@Override
	 */
	public String toString()
	{
		return ("\nDeparts " + super.getCountry() + "\n" + super.getLocation() + 
				"\nTerminal: " + super.getTerminals() + "\nGate: " + super.getGate() 
				+ "\nDeparting times: "+ super.getTime());
	}
}
