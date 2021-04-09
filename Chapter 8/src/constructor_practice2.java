public class constructor_practice2
{
	
	//writing private makes these fields only acceptable by this respective class
	private int num_of_markers;
	private String markercolor;
	
	
	/** This creates a constructor for the marker types
	 * 
	 * @param Color
	 * @param Number
	 */
	public constructor_practice2(String Color, int Number)
	{
		
		//over here I attached the fields of the constructor_practice2 class to the parameters 
		// Color and Number in order to make these class objects 
		markercolor = Color;
		num_of_markers = Number;
		

	}
	
	public void setmarkercolor (String Color)
	{
		markercolor = Color;
	}
	
	public String getmarkercolor()
	{
		return markercolor;
	}
	
	
	/** this creates a local paramenter Number
	 * 
	 * @param Number
	 */
	public void setnumMarkers (int Number)
	{
		Number = num_of_markers;
	}
	
	public int getnumMarkers()
	{
		return num_of_markers;
	}
	
	
	
	
	
	
}