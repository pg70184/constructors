import java.util.Scanner;

public class ReturnObjectDemo
{
	public static void main(String [] args)
	{
		//get an initialized phone book entry object
		phonebook entry = getEntry();
		
		//displays the object's data
		System.out.println("Here is the information you provided: ");
		System.out.println("Name: " + entry.getName());
		System.out.println("Phone Number: " + entry.getPhoneNumber());
	}
	
	public static phonebook getEntry()
	{
		//creates a scanner object for the keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Get's a person's name
		System.out.print("Enter a Name: ");
		String personName = keyboard.nextLine();
		
		//Get a person's phone number
		System.out.print("Enter the phone number: ");
		String personPhone = keyboard.nextLine();
		
		//Returns a phonebook object initialized with the user's input
		return new phonebook(personName, personPhone);
	}
}