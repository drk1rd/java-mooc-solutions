import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        int sum = 1;
        
            
        for (int i = 1; i < lastNumber; i++) {
            sum = sum * i;
        }
        int answer = sum * lastNumber;
        System.out.println("Factorial: " + answer);
    }
}