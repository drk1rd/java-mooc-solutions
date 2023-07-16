
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true){
            System.out.println("Give a number:");
            int i = Integer.valueOf(scanner.nextLine());
            if (i!=0){
                num = num+1;
                continue;
            }else{
                System.out.println("Number of numbers: "+num);
                break;
            }
        }

    }
}
