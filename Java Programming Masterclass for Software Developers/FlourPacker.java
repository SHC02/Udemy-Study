package parseString;

public class FlourPacker {
	public static boolean canPack(int bigCount, int smallCount, int goal)
	{
		//bigCount = count of big flour bags(5 kilograms each)
		//smallCount = count of small flour bags(1 kilograms each)
		//goal = goal amount of kilos of flour needed to assemble a package.
		if(bigCount < 0 || smallCount < 0 || goal < 0)
		{
			return false;
		}
		
		bigCount *= 5;
		
		if(bigCount + smallCount >= goal)
		{
			if(smallCount >= goal % 5)
			{
				return true;
			}
		}
		return false;
	}
}
