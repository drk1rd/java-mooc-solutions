
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
     
        while (true){
            System.out.println("Give a number:");
            int i = Integer.valueOf(scanner.nextLine());
            if (i!=0){
                num = num+1;
                sum = sum+i;
                continue;
            }else{
                double avg = (double) sum/num;
                System.out.println("Average of the numbers: "+avg);
                break;
            }
        }
    }
}
