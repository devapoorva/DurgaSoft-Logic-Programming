import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class LBP_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Integer.toBinaryString(number));
        StringBuilder stringBuilder = new StringBuilder();
        int[] digits = new int[10];
        int count = 0;
        while (number>0){
            int reminder = number % 2;
            stringBuilder.append(reminder);
            digits[count++] = reminder;
            number/=2;
        }
        for(int i=count-1;i>=0;i--){
            System.out.print(digits[i]);
        }
        System.out.println(stringBuilder.reverse());
    }
}
