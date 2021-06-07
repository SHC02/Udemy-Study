package forStatement;

public class ForStatement {
	public static void main(String[] args)
	{
		System.out.println("10,000$  at 2% interests = " + calculateInterest(10000, 2));
		System.out.println("10,000$  at 3% interests = " + calculateInterest(10000, 3));
		System.out.println("10,000$  at 4% interests = " + calculateInterest(10000, 4));
		System.out.println("10,000$  at 5% interests = " + calculateInterest(10000, 5));
		
		System.out.println("********************");
		
		// for(init; termination; increment)
		for(int i = 2; i <9; i++)
		{
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
		}
		
		System.out.println("********************");
		
		// BACKWARDS
		for(int i = 8; i >=2; i--)
		{
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
		}
		
		// using method isPrime
		int count = 0;
		for(int i = 10; i<500; i++)
		{
			if(isPrime(i))
			{
				count++;
				System.out.println("Number " + i + " is a prime number");
				if(count == 20)
				{
					System.out.println("Exit the loop");
					break;
				}
			}
		}
	}
	
	// Calculate the interest rate
	public static double calculateInterest(double amount, double interestRate)
	{
		return (amount * (interestRate/100));
	}
	
	// Finding Prime Numbers
	public static boolean isPrime(int n)
	{
		if(n == 1)
		{
			return false;
		}
		
		for(int i = 2; i <= n/2; i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
