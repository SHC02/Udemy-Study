package parseString;

import java.util.Scanner;

public class InputCalculator
{
    public static void inputThenPrintSumAndAverage()
    {
        Scanner stdIn = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long roundAvg = 0;
        while(true)
        {
            boolean isAnInt = stdIn.hasNextInt();
            if(isAnInt)
            {
                count++;
                int number = stdIn.nextInt();
                sum += number;
                roundAvg = Math.round((double) sum / (double) count);
            } 
            else
            {
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + roundAvg);
        stdIn.close();
    }
}