import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LBP_006
{
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int cups = Integer.parseInt(bufferedReader.readLine());
			if(cups>=1)
			{
				int totalFree = cups/6;
				System.out.println(cups+totalFree);
			}
			else
			{
				System.out.println("invalid");
			}
		}
		catch(IOException exception)
		{
			System.out.println(exception.getMessage());
		}

	}
}