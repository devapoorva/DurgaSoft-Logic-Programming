import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class LBP_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit = scanner.nextInt();
        int result = 0;
        while (number>0){
            int reminder = number%10;
            if(reminder==digit)
                result++;
            number = number/10;
        }
        System.out.println(result);

    }
}
