package sum3and5Challenge;

public class Sum3and5Challenge {
	public static void main(String[] args)
	{
		int count = 0;
		int sum = 0;
		for(int i = 0; i < 1000; i++)
		{
			if(test(i))
			{
				count++;
				sum += i;
				System.out.println("find the number is " + i);
				System.out.println("Sum is : " + sum);
				if(count == 5)
				{
					System.out.println("Exit the loop");
					break;
				}
			}
		}
	}
	public static boolean test(int n)
	{
		for(int i = 0; i < 1000; i++)
		{
			if(n % 3 == 0 && n % 5 == 0 && n != 0)
			{
				n++;
				return true;
			}
		}
		return false;
	}
}
