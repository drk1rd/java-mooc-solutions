
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int i = Integer.valueOf(scanner.nextLine());
        int count = 0;
        int sum = 0;
        while (count<=i){
            sum = sum + count;
            count++;
        }
        System.out.println("The sum is "+sum);

    }
}
