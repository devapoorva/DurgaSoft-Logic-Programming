import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LBP_003
{
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int year = Integer.parseInt(bufferedReader.readLine());
			if(year>0)
			{
				if(year%100==0)
				{
					if(year%400==0)
						System.out.println("True");
					else
						System.out.println("False");
				}
				else if(year%4==0)
				{
					System.out.println("True");
				}
				else
				{
					System.out.println("False");
				}
			}
			else
				System.out.println("invalid");
		}
		catch(IOException exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}