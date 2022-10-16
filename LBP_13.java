import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Implement a program to calculate number of digits in the given number
 */
class LBP_13
{
	public static void main(String[] args) {
		int totalDigit = 0;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int number = Integer.parseInt(bufferedReader.readLine());
			while(number>0)
			{
				totalDigit++;
				number/=10;
			}
			System.out.println(totalDigit);
		}
		catch(IOException exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}