import java.util.Scanner;

public class constructor_practice
{
	public static void main (String [] args)
	{
		constructor_practice2 pens = pens();
		
		//this will print out the number of pens that are there
		System.out.println("There are " + pens.getnumMarkers() + " pens");
		
		//this will print out the color of the pens
		System.out.println("The pens are the Color " + pens.getmarkercolor());
	}
	
	
	
	//this is a class that will print out the number of pens that an individual has 
	public static constructor_practice2 pens()
	{
		
		//this was called in to create a local scanner in the method
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many pens do you have?: ");
		int pens_num = keyboard.nextInt();
		
		System.out.println("What Color are those pens?: ");
		String pen_color = keyboard.next();
		
		return new constructor_practice2(pen_color, pens_num);
	}
}