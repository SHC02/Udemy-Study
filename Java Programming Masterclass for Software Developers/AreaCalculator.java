package areaCalculator;

// operator '?' meaning is same as == .
// operator : meaning is same as 'else'.
// For example, return (radius < 0) ? -1: radius* radius* Math.PI means
// == if(radius<0), return -1, else: radius * radius * Math.PI;

public class AreaCalculator {
	
	public static double area(double radius)
	{
		return (radius < 0) ? -1 : radius * radius * Math.PI;
	}
	public static double area(double x, double y)
	{
		return (x <0 || y < 0) ? -1 : x * y;
	}
}
