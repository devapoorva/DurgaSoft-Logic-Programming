import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Given an integer n, perform the following conditional actions,
 * If n is odd, print weird,
	If n is even and in the inclusive range of 2 to 5, print not weird,
	If n is even and in the inclusive range 6 to 20, print weird,
	If n is even and greater than 20, print not weird.
 */
class LBP_002
{
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int number = Integer.parseInt(bufferedReader.readLine());
			if(number>=0 && number<=100)
			{
				if(number%2!=0)
					System.out.println("Weird");
				else
				{
					if(number>=2 && number<=5)
						System.out.println("Not Weird");
					else if(number>=6 && number<=20)
						System.out.println("Weird");
					else if(number>20)
						System.out.println("Not Weird");
				}
			}
			else
				System.out.println("invalid");
		}catch(IOException exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}