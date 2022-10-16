import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LBP_11
{
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int number = Integer.parseInt(bufferedReader.readLine());
			int primeSum = 0;
			while(number>0)
			{
				int reminder = number%10;
				if(isPrime(reminder))
					primeSum+=reminder;
				number/=10;
			}
			System.out.println(primeSum);
		}catch(IOException exception)
		{
			System.out.println(exception.getMessage());
		}
	}

	public static boolean isPrime(int number)
	{ 
		if(number==1)
			return false;
		if(number==2 || number==3)
			return true;
		int totalFactor = 0;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				totalFactor++;
				break;
			}
		}
		if(totalFactor==0)
			return true;
		else 
			return false; 
	}
}