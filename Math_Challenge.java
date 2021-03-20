import java.util.*;

public class MathChallenge
{
	static String Math(int num1, int num2)
	{
		if(num1 == num2)
			return("-1");
		else if(num1 > num2)
			return("false");
		else
			return("true");
	}
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
	
		int num1 = S.nextInt();
		int num2 = S.nextInt();

		if(math(num1, num2).equals("-1"))
			System.out.println(integer.parseInt(Math(num1, num2)));
		else
			System.out.println(Math(num1, num2));
	}
}