package evenDigitSum;

public class EvenDigitSum {
	public static int getEvenDigitSum(int number)
	{
		if(number < 0)
		{
			return -1;
		}
		
		int evenDigitSum = 0;
		
		while(number > 0)
		{
			// get digit with remaining
			int digit = number % 10;
			
			// if remaining number is can divided by 2 , 
			if(digit % 2 == 0)
			{
				evenDigitSum += digit;
			}
			number /= 10;
		}
		
		return evenDigitSum;
	}
}
