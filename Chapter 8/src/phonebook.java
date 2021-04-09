public class phonebook
{
	//these are the fields: these are variable types that can be used by any methods
	private String name;
	private String phoneNumber;
	
	/**
	 * Constructor
	 * @param aName: a parameter for a person's name
	 * @param aPhoneNumber: is a parameter for a person's phone number
	 */
	
	public phonebook(String aName, String aPhoneNumber)
	{
		name = aName;
		phoneNumber = aPhoneNumber;
	}
	
	/** The setName method sets the name field
	 * @param aName: a parameter for a person's name
	 */
	
	public void setName(String aName)
	{
		name = aName;
	}
	
	public void setPhoneNumber(String aPhoneNumber) 
	{
		phoneNumber = aPhoneNumber;
	}
	
	/** the getName method will return a person's name
	 * @return the value of the name field
	 */
	public String getName()
	{
		return name;
	}
	
	/** The getPhoneNumber method will return a person's phone number
	 * @return the value of the phoneNumber field
	 * */
	 public String getPhoneNumber()
	 {
		 return phoneNumber;
	 }
}