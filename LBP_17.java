import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class LBP_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temp = number;
        int reverse = 0;
        while (number>0){
            int reminder = number %10;
            reverse = reverse * 10 +reminder;
            number = number/10;
        }
        if(temp==reverse)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
