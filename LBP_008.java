import java.io.BufferedReader;
import java.io.InputStreamReader;

class LBP_008
{
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int sum=0;
			int number = Integer.parseInt(bufferedReader.readLine());
			while(number>0)
			{
				int reminder = number%10;
				sum+=reminder;
				number/=10;
			}
			System.out.println(sum);
		}catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}