import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LBP_009
{
	public static void main(String[] args) {
		int evenSum=0;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int number = Integer.parseInt(bufferedReader.readLine());
			while(number>0)
			{
				int reminder = number%10;
				if(reminder%2==0)
					evenSum+=reminder;
				number/=10;
			}
			System.out.print(evenSum);
		}
		catch(IOException exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}