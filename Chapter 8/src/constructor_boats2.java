public class constructor_boats2
{
	private String boatcolor;
	private String boatspeed;
	private String boattype;
	
	/** This is for a method named boat color with a parameter for the color of the boat
	 * 
	 * @param colorofboat
	 */
	
	public constructor_boats2 (String boat_color, String boat_speed, String boat_type)
	{
		boatcolor = boat_color;
		boatspeed = boat_speed;
		boattype = boat_type;
	}
	public void boatcolor(String colorofboat)
	{
		colorofboat = boatcolor;
	}
	
	public String getboatcolor()
	{
		return boatcolor;
	}
	
	public void setboatspeed(String speedofboat)
	{
		speedofboat = boatspeed;
	}
	
	public String getboatspeed()
	{
		return boatspeed;
	}
	
	public void setboattype(String type)
	{
		type = boattype;
	}
	
	public String getboattype()
	{
		return boattype;
	}
}