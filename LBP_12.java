import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * Implement a program to calculate sum of digits that are divisible by 3 
 * in the given number
 */
class LBP_12
{
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int number = Integer.parseInt(bufferedReader.readLine());
			if(number>0)
			{
				int sum=0;
				while(number>0)
				{
					int reminder = number%10;
					if(reminder%3==0)
						sum+=reminder;
					number/=10;
				}
				System.out.println(sum);
			}
			else
				System.out.println("invalid");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}