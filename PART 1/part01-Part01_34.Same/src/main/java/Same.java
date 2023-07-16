
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String v = scan.nextLine();
        System.out.println("Enter the second string:");
        String c = scan.nextLine();
        if (v.equals(c)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
