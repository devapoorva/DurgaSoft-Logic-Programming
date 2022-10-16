import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Program to read a number and check whether it is duck number or not.
 * Hint: A duck number is a number which has zeros present in it, but no zero
 * present in the begining of the number.
 */
class LBP_15
{
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			
			int number = Integer.parseInt(bufferedReader.readLine());
			while(number>0)
			{
				int reminder = number%10;
				
				number/=10;
			}

		}catch(IOException exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}