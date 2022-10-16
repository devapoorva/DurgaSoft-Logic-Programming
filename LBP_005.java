import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LBP_005
{
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int number = Integer.parseInt(bufferedReader.readLine());
			System.out.println(++number);
		}
		catch(IOException exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}