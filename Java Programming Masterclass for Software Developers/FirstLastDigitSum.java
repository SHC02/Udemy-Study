package firstLastDigitSum;

/**
 * @author Sehyun Cho
 * 
 * Finding first and last digit numbers and adding up. 
 * Ex) 123 = 1+3 = 4, 1235 = 1+5 = 6
 * 
 */
public class FirstLastDigitSum {
	public static int sumFirstAndLastDigit(int number)
	{
		// if number is negative value, return -1
		if(number < 0)
		{
			return -1;
		}
		
		// Variables declaration
		int firstDigit = 0;
		int lastDigit = number % 10;
		
		// while number is bigger than 0
		while(number > 0)
		{
			firstDigit = number;
			number /= 10;
		}
		// to get sum, adding up first digit and last digit
		int sum = firstDigit + lastDigit;
		
		// return sum
		return sum;
		
	}
}
