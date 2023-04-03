import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class LBP_20 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        int start = 1;
        int end = 1;
        int count = 2;
        while (count<=num){
            int sum = start + end;
            start = end;
            end = sum;
            count++;
        }
        System.out.println(start);
    }
}
