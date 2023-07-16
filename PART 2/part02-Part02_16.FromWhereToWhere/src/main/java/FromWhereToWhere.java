
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int j = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int i = Integer.valueOf(scanner.nextLine());
        if (j<i){
            System.out.println("");
        }else{
            while (i<=j){
                System.out.println(i++);
            }
        }
    }
}
