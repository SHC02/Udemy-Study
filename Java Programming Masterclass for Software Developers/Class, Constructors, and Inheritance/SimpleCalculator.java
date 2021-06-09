package simpleCalculator;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    
    public double getFirstNumber()
    {
        return this.firstNumber;
    }
    public double getSecondNumber()
    {
        return this.secondNumber;
    }
    public void setFirstNumber(double firstNumber)
    {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber)
    {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult()
    {
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult()
    {
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult()
    {
        return firstNumber * secondNumber;
    }
    public double getDivisionResult()
    {
    	double result = 0.0;
    	
    	if(secondNumber == 0)
    	{
    		result = 0.0;
    	}
    	else
    	{
    		result = firstNumber / secondNumber;
    	}
        return result;
    }
}