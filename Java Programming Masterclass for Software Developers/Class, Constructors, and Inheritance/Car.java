package classesePractice;
/**
 * 
 * @author Sehyun
 * 
 *
 */
public class Car {
	
	// private == do not allow a class outside of the car class to access these variables.
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	public void setModel(String model)
	{
		String validModel = model.toLowerCase();
		if(validModel.equals("carrera") || validModel.equals("commodore"))
		{
			//update the field
			this.model = model;	
		} else {
			this.model = "Unknown";
		}
	}
	
	public String getModel()
	{
		return this.model;
	}
	
}
