/**
 * 
 * @author Sehyun Cho
 * What is palindrome number?
 * : parlinedrome number is the number which when reversed is equal to the original number.
 * Such as: 121, 12321, 010, 1001
 */
package numberPalindrome;

public class NumberPalindrome {
		public static boolean isPalindrome(int number)
		{
			// if number is negative number
			if(number < 0)
			{
			    number *= -1;
			}
		    
			// variables declaration
		   	int reverse = 0;
			int stored = number;
			
			// while number is stored
			while(stored > 0)
			{
				// last digit is the remaining value of the original number. so divided by 10.
			    int lastDigit = stored % 10;
			    
			    // to get reverse number, multiply 10 again to get original number and adding last digit.
				reverse = (reverse * 10) + lastDigit;
				stored /= 10;	
			}
			
			// if original number and reverse number is same, then it is Palindrome number.
			if(number == reverse)
			{
				return true;
			}
			// Otherwise, return false.
			return false;
		}
}