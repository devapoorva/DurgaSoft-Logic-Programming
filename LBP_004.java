import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * The e-commerce company Bookshelf wishes to analyze its monthly sales data 
 * between minimum ranges 30 to maximum range 100. The company has categorized these 
 * book sales into four groups depending on the number of sales, with the help of 
 * these groups the company will know which stock they should increase or 
 * decrease in their inventory for the next month. The groups are as follows
	Sales range groups
	30-50 ------------------> D
	51-60 ------------------> C
	61-80 ------------------> B
	81-100 -----------------> A
	Write an algorithm to find the group for the given book sale count.
 */
class LBP_004
{
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int salesRange = Integer.parseInt(bufferedReader.readLine());
			if(salesRange>=30 && salesRange<=100)
			{
				if(salesRange>=30 && salesRange<=50)
					System.out.println("D");
				else if(salesRange>50 && salesRange<=60)
					System.out.println("C");
				else if(salesRange>60 && salesRange<=80)
					System.out.println("B");
				else
					System.out.println("A");
			}
			else
			{
				System.out.println("invalid");
			}
		}catch(IOException exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}