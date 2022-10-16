import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class LBP_010
{
	public static void main(String[] args) {
		int oddSum = 0;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int number = Integer.parseInt(bufferedReader.readLine());
			while (number > 0) {
				int reminder = number % 10;
				if (reminder % 2 != 0)
					oddSum += reminder;
				number /= 10;
			}
			System.out.print(oddSum);
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		}
	}
}