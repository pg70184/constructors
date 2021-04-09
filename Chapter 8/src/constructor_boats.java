/** Create a project that utilizes constructors for three qualities of a boat
the type of boat "big", "little", or "Medium"
The color of the boat "Blue", "Red"
and speed of the boat "Fast", "Slow", "Normal"
*/

import java.util.Scanner;

public class constructor_boats
{
	

public static void main (String [] args)
{
	constructor_boats2 boatinfo = boatinfo();
	
	
	System.out.println("The type of boat is: " + boatinfo.getboattype());
	
	
	System.out.println("The color of the boat is: " + boatinfo.getboatcolor());
	
	
	System.out.println("The speed of the boat is: " + boatinfo.getboatspeed());
	
	
}


public static constructor_boats2 boatinfo()
{
	Scanner ocean = new Scanner(System.in);
	
	System.out.println("What is the color of the boat?: ");
	String boatcolor = ocean.nextLine();
	
	System.out.println("What kind of boat is it?: ");
	String boattype = ocean.nextLine();
	
	System.out.println("What size is the boat? ");
	String boatsize = ocean.nextLine();
	
	return new constructor_boats2(boatsize, boatcolor, boattype);
			
}




}