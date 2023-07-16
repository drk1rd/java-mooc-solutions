
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int even = 0;
        int odd = 0;
        while (true){
            System.out.println("Give number:");
            int i = Integer.valueOf(scanner.nextLine());
            count = count+1;
            sum = sum+i;
            if (i%2==0){
                even++;
            }else{
                odd++;
            }
            if (i==-1){
                System.out.println("Thx! Bye!");
                System.out.println("Sum: "+(sum+1));
                System.out.println("Numbers: "+(count-1));
                double avg = (double) (sum+1)/(count-1);
                System.out.println("Average: "+avg);
                System.out.println("Even: "+even);
                System.out.println("Odd: "+(odd-1));
                
                break;
            }
            
        }

    }
}
