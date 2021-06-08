package lastDigitChecker;

public class LastDigitChecker {
	public static boolean hasSameLastDigit(int num1, int num2, int num3)
	{
		if(num1 < 10 || num2 < 10 || num3 < 10 || num1 > 1000 || num2 > 1000 || num3 > 1000)
		{
			return false;
		}
		
		int num1LD = num1 % 10;
		int num2LD = num2 % 10;
		int num3LD = num3 % 10;
		
		return (num1LD == num2LD || num1LD == num3LD || num2LD == num3LD);
	}
	
	public static boolean isValid(int a)
	{
		if(a < 10 || a > 1000)
		{
			return false;
		}
		return true;
	}
}
