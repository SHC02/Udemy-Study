/**
 * @author Sehyun Cho
 *  
 *  teen is range of 13 to 19 years
 *  method hasTeen 3 parameters of int
 *  Check if at least one of the person is range of the teenager = return true
 *  Otherwise, return false
 *  
 *  isTeen is checking only one person if he/she is teenager or not.
 * 
 */
package teenNumberChecker;

public class TeenNumberChecker {
	public static boolean hasTeen(int x, int y, int z)
	{
		return ((x >= 13 && x < 20) || (y >= 13 && y < 20) || (z >= 13 && z < 20));
	}
	public static boolean isTeen(int x)
	{
		return (x >= 13 && x < 20);
	}
}
