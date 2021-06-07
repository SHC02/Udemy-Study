package decimalComparator;

// find if two numbers are same in three decimal places.

public class DecimalComparator {
	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
	{
		return (int)(num1*1000) == (int)(num2*1000);
	}
}
