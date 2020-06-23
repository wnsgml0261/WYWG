package WYWG;

import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		String country, state = "", depart = "", arrival = "", gate = "";
		int distance = 0, terminal = 0, aTerminal = 0;
		String aGate ="";
		double cost = 0;
		
		Scanner x = new Scanner(System.in);
		
		
		
		System.out.println("Welcome to WYWG(Where you wanna go?)!"
				+ "\n[Korea, France, Italy, Cancun, Cuba, Japan, China] Please choose between these and type.\nwhere do you want to trip?");
		country = x.nextLine();
		
		if(country.equalsIgnoreCase("Korea"))
		{
			System.out.println("\nWhere are you go to city\n choice ICN[Incheon, Seoul] or PUS[Pusan]");
			System.out.println("Please type ICN or PUS");
			state = x.nextLine();
			switch(state)
			{
			case "ICN":
				distance = 6893;
				
				aTerminal = 4;
				aGate = "1";
				break;
			case "PUS":
				distance = 8633;
				aTerminal = 1;
				aGate = "2";
				break;
			default:
				System.out.println("Please enter ICN or PUS");
				System.exit(1);
			}
		}
		else if(country.equalsIgnoreCase("France"))
		{
			System.out.println("\nWhere are you go to city\n choice PAR[Paris,France] or LYN[Lyon,France]");
			System.out.println("Please type PAR or LYN");
			state = x.nextLine();
			switch(state)
			{
			case "PAR":
				distance = 3627;
				aTerminal = 2;
				aGate = "5";
				break;
			case "LYN":
				distance = 3378;
				aTerminal = 1;
				aGate = "7D";
				break;
			default:
				System.out.println("Please enter PAR or LYN");
				System.exit(1);
			}
		}
		else if(country.equalsIgnoreCase("Italy"))
		{
			System.out.println("\nWhere are you go to city\n choice ROM[Rome, Italy] or MIL[Milano, Italy]");
			System.out.println("Please type ROM or MIL");
			state = x.nextLine();
			switch(state)
			{
			case "ROM":
				aTerminal = 7;
				aGate = "5";
				distance = 4269;
				break;
			case "MIL":
				aTerminal = 4;
				aGate = "3C";
				distance = 4284;
				break;
			default:
				System.out.println("Please enter ROM or MIL");
				System.exit(1);
			}
		}
		else if(country.equalsIgnoreCase("Cancun"))
		{
			aTerminal = 1;
			aGate = "1";
			distance = 1557;
		}
		else if(country.equalsIgnoreCase("Cuba"))
		{
			System.out.println("\nWhere are you go to city\n choice HAV[Havana, Cuba] or SNU[Santa Clara, Cuba]");
			System.out.println("Please type HAV or SNU");
			state = x.nextLine();
			switch(state)
			{
			case "HAV":
				aTerminal = 4;
				aGate = "2";
				distance = 1319;
				break;
			case "SNU":
				aTerminal = 1;
				aGate = "4C";
				distance = 1318;
				break;
			default:
				System.out.println("Please enter HAV or SNU");
			}
		}
		else if(country.equalsIgnoreCase("Japan"))
		{
			System.out.println("\nWhere are you go to city\n choice NRT[Tokyo, Japan] or CTS[Sappro, Japan]");
			System.out.println("Please type NRT or CTS");
			state = x.nextLine();
			switch(state)
			{
			case "NRT":
				aTerminal = 8;
				aGate = "10";
				distance = 6731;
				break;
			case "CTS":
				aTerminal = 7;
				aGate = "9";
				distance = 9483;
				break;
			default:
				System.out.println("Please enter NRT or CTS");
				System.exit(1);
			}
		}
		else if(country.equalsIgnoreCase("China"))
		{
			System.out.println("\nWhere are you go to city\n choice PEK[Beijing, China] or PVG[Shanghai, China]");
			System.out.println("Please type PEK or PVG");
			state = x.nextLine();
			switch(state)
			{
			case "PEK":
				aTerminal = 4;
				aGate = "2";
				distance = 6824;
				break;
			case "PVG":
				aTerminal = 2;
				aGate = "6";
				distance = 7379;
				break;
			default:
				System.out.println("Please enter HAV or SNU");
				System.exit(1);
			}
		}
		else
		{
			System.out.println("We can not find your destination");
			System.exit(1);
		}
		  
		System.out.println("Korean air, Asiana airlines, United airlines, American airlines, Delta, China Southern"
							+ " Air France, jetBlue Airways \nPlease choose your air lines.");
		String air = x.nextLine();
		
		if(air.equalsIgnoreCase("Korean air"))
		{
			terminal = 1;
			gate = "2";
			cost = 1656.34;
			
			AirLine line = new AirLine(air,2 );
			System.out.println(line.toString());
			
			System.out.println("We have only 12:50AM and 2:00PM every day."
					+ "\nPlease choose your departs time at JFK. \n 1.12:50AM and 2. 2:00PM.");
			depart = x.nextLine();
			switch(depart)
			{
			case "1":
				depart = "12:50 AM";
				System.out.println("Your depart time is " + depart);
				arrival = "4:30 PM";
				System.out.println("Your arrival time is " + arrival);
				break;
				
			case "2":
				depart = "2:00 PM";
				System.out.println("Your depart time is " + depart);
				arrival = "6:30 AM";
				System.out.println("Your arrival time is " + arrival);
				break;
			default:
				System.out.println("Please type 1 or 2.");	
				System.exit(1);
			}
		}
		else if(air.equalsIgnoreCase("Asiana airlines"))
		{
			terminal = 3;
			gate = "4";
			cost = 1389.86;
			
			AirLine line = new AirLine(air,3);
			System.out.println(line.toString());
			
			System.out.println("We have only 8:00AM , 1:00PM, and 8:00PM every day."
					+ "\nPlease choose your departs time at JFK. "
					+ "\n1.8:00AM, 2. 1:00PM, and 3.8:00PM .");
			depart = x.nextLine();
			switch(depart)
			{
			case "1":
				depart = "8:00 AM";
				System.out.println("Your depart time is " + depart);
				arrival = "10:00 PM";
				System.out.println("Your arrival time is " + arrival);
				break;
				
			case "2":
				depart = "1;00 PM";
				System.out.println("Your depart time is " + depart);
				arrival = "3:34 AM";
				System.out.println("Your arrival time is " + arrival);
				break;
			case "3":
				depart = "8:00 PM";
				System.out.println("Your depart time is " + depart);
				arrival = "10:00 AM";
				System.out.println("Your arrival time is " + arrival);
				break;
				
			default:
				System.out.println("Please type 1 or 2.");	
				System.exit(1);
			}
		}
		else if(air.equalsIgnoreCase("United airlines"))
		{
			terminal = 1;
			gate = "5A";
			cost = 1301.79;
			
			AirLine line = new AirLine(air,2);
			System.out.println(line.toString());
			System.out.println("We have only 2:00PM and 4:00AM every day."
					+ "\nPlease choose your departs time at JFK. "
					+ "\n1. 4:00AM and 2. 2:00PM .");
			depart = x.nextLine();
			
			switch(depart)
			{
			case "1":
				depart = "4:00 AM";
				System.out.println("Your depart time is " + depart);
				arrival = "7:30 PM";
				System.out.println("Your arrival time is " + arrival);
				break;
				
			case "2":
				depart = "2:00 PM";
				System.out.println("Your depart time is " + depart);
				arrival = "6:00 AM";
				System.out.println("Your arrival time is " + arrival);
				break;
			default:
				System.out.println("Please type 1 or 2.");	
				System.exit(1);
			}
		}
		else if(air.equalsIgnoreCase("American airlines"))
		{
			terminal = 2;
			gate = "7B";
			cost = 1401.99;
			
			AirLine line = new AirLine(air,4);
			System.out.println(line.toString());
			
			System.out.println("We have only 6:00AM, 11:00AM, 1:30PM, and 5:00PM every day."
					+ "\nPlease choose your departs time at JFK. "
					+ "\n1. 6:00AM, 2. 11:00AM, 3. 1:30PM, and 4. 5:00PM .");
			depart = x.nextLine();
			
			switch(depart)
			{
			case "1":
				depart = "6:00 AM";
				System.out.println("Your depart time is " + depart);
				arrival = "9:00 PM";
				System.out.println("Your arrival time is " + arrival);
				break;
				
			case "2":
				depart = "11:00 AM";
				System.out.println("Your depart time is " + depart);
				arrival = "3:38 PM";
				System.out.println("Your arrival time is " + arrival);
				break;
			case "3":
				depart = "1:30 PM";
				System.out.println("Your depart time is " + depart);
				arrival = "6:00 AM";
				System.out.println("Your arrival time is " + arrival);
				break;
				
			case "4":
				depart = "5:00 PM";
				System.out.println("Your depart time is " + depart);
				arrival = "8:45 AM";
				System.out.println("Your arrival time is " + arrival);
				break;
			default:
				System.out.println("Please type 1 or 2.");	
				System.exit(1);
			}
		}
		else if(air.equalsIgnoreCase("Delta"))
		{
			terminal = 1;
			gate = "11";
			cost = 1074.90;
			
			AirLine line = new AirLine(air,3);
			System.out.println(line.toString());
			System.out.println("We have only 8:00AM , 1:00PM, and 8:00PM every day."
					+ "\nPlease choose your departs time at JFK. "
					+ "\n1.8:00AM, 2. 1:00PM, and 3.8:00PM .");
			depart = x.nextLine();
			switch(depart)
			{
			case "1":
				depart = "8:00 AM";
				System.out.println("Your depart time is " + depart);
				arrival = "10:00 PM";
				System.out.println("Your arrival time is " + arrival);
				break;
				
			case "2":
				depart = "1;00 PM";
				System.out.println("Your depart time is " + depart);
				arrival = "3:34 AM";
				System.out.println("Your arrival time is " + arrival);
				break;
			case "3":
				depart = "8:00 PM";
				System.out.println("Your depart time is " + depart);
				arrival = "10:00 AM";
				System.out.println("Your arrival time is " + arrival);
				break;
				
			default:
				System.out.println("Please type 1 or 2.");	
				System.exit(1);
			}
		}
		else if(air.equalsIgnoreCase("China Southern"))
		{
			terminal = 7;
			gate = "25";
			cost = 992.89;
			
			AirLine line = new AirLine(air,2);
			System.out.println(line.toString());
		
			System.out.println("We have only 6:00AM, and 5:00PM every day."
					+ "\nPlease choose your departs time at JFK. "
					+ "\n1. 6:00AM, 2. 5:00PM .");
			depart = x.nextLine();
			
			switch(depart)
			{
			case "1":
				depart = "6:00 AM";
				System.out.println("Your depart time is " + depart);
				arrival = "9:00 PM";
				System.out.println("Your arrival time is " + arrival);
				break;
			case "2":
				depart = "5:00 PM";
				System.out.println("Your depart time is " + depart);
				arrival = "8:45 AM";
				System.out.println("Your arrival time is " + arrival);
				break;
			default:
				System.out.println("Please type 1 or 2.");	
				System.exit(1);
			}
		}
		else if(air.equalsIgnoreCase("Air france"))
		{
			terminal = 5;
			gate = "7C";
			cost = 1008.78;
			
			AirLine line = new AirLine(air,1);
			System.out.println(line.toString());
			
			System.out.println("We have only 12:50AM every day."
					+ "\nPlease choose your departs time at JFK. \n 1.12:50AM");
			depart = x.nextLine();
			switch(depart)
			{
			case "1":
				depart = "12:50 AM";
				System.out.println("Your depart time is " + depart);
				arrival = "4:30 PM";
				System.out.println("Your arrival time is " + arrival);
				break;
			default:
				System.out.println("Please type 1 or 2.");	
				System.exit(1);
			}
		}
		else if(air.equalsIgnoreCase("jetBlue Airways"))
		{
			System.out.println("jetBlue Airways does not flight to your destination.");
			System.exit(1);
		}
		else
		{
			System.out.println("Unfortunately, we do not have your air line");
			System.exit(1);
		}
		
		
		Departs departing = new Departs("JFK", "United States", terminal, gate, depart);
		
		Destination arriving = new Destination(state, country, aTerminal, aGate, arrival); 
		AirPlane plane = new AirPlane(air, 0 , distance, cost);
		
		System.out.println(departing.toString() + "\n" + arriving.toString());
		
		System.out.println(plane.toString() + "\nThank you for choosing " +
							plane.getName() + "! Enjoy your trip!");
		
		x.close();
	}
}
