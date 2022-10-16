import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

class LBP_007
{
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int number = Integer.parseInt(bufferedReader.readLine()); 
			while(number>0)
			{
				int reminder = number%10;
				number = number/10;
				System.out.print(reminder+" ");
			} 
		}catch(IOException exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}