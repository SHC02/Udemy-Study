package sharedDigit;

public class SharedDigit {
	public static boolean hasSharedDigit(int x, int y)
	{
		if(x < 10 || x > 99 || y < 10 || y > 99)
		{
			return false;
		}
		
		int xDigit0 = x / 10;
		int yDigit0 = y / 10;
		int xDigit1 = x % 10;
		int yDigit1 = y % 10;
		
		return (xDigit0 == yDigit0 || yDigit0 == xDigit1 || yDigit1 == xDigit0 || xDigit1 == yDigit1);
	}
}
