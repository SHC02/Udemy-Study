/**
 * @author Sehyun Cho
 * 
 * Barking dog
 * 
 * 
 * 
 */
package barkingDog;

public class BarkingDog {
	public static boolean shouldWakeUp(boolean barking, int hourOfDay)
	{
		if(hourOfDay < 0 || hourOfDay > 23)
		{
			return false;
		}
		
		else if(barking == true && hourOfDay <8 || hourOfDay > 22)
		{
			return true;
		}
		else if(barking == false && hourOfDay < 8 || hourOfDay > 22)
		{
			return false;
		}
		else{
			return false;
		}
	}
}
