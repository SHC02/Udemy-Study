package playingCat;

// cat is playing if the temperature is 25<t<35
// IF IT IS  summer, then the upper limit is 25<t<45.	
public class PlayingCat {
	public static boolean isCatPlaying(boolean summer, int temperature)
	{
		if(summer == true && temperature >= 25 && temperature <= 45)
		{
			return true;
		} 
		if(summer == false && temperature >= 25 && temperature <= 35)
		{
			return true;
		}
		else
			return false;
	}
}
