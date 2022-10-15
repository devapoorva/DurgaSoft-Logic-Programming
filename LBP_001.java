import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LBP_001
{
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int number = Integer.parseInt(bufferedReader.readLine());
			if(number>=0)
			{
				if (number % 2 == 0)
					System.out.println("even");
				else
					System.out.println("odd");
			}
			else
				System.out.println("invalid");
		}catch(IOException exception)
		{
			System.out.println(exception.getMessage());
		}
		
	}
}