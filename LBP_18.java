import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class LBP_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int day = scanner.nextInt();
        System.out.println(checkBirthday(month,day));
    }

    public static int checkBirthday(String month,int day){
        return month.equalsIgnoreCase("July") && day==5 ? 1 : 0;
        /*if(month.equalsIgnoreCase("July") && day==5)
            return 1;
        else
            return 0;*/
    }
}
