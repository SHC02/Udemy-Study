package parseString;
import java.util.Scanner;

public class MinAndMaxChallenge {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		boolean first = true;
		while(true)
		{
			System.out.println("Enter the number: ");
			boolean isAnInt = stdIn.hasNextInt();
			
			if(isAnInt)
			{
				int number = stdIn.nextInt();
				if(first)
				{
					first = false;
					min = number;
					max = number;
				}
				
				if(number < min)
				{
					min = number;
				}
			}
			else
			{
				break;
			}
			stdIn.nextLine(); // handle input
		}
		System.out.println("min = " + min + ", max = " + max);
		
		stdIn.close();
	}
}
