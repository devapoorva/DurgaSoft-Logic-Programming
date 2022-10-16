import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LBP_14
{
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int reversedNumber = 0;
		try {
			int number = Integer.parseInt(bufferedReader.readLine());
			while(number>0)
			{
				int reminder = number%10;
				reversedNumber = (reversedNumber*10)+reminder;
				number/=10;
			}
			System.out.println(reversedNumber);
		} catch (IOException exception) { 
			System.out.println(exception.getMessage());
		}
	}
}