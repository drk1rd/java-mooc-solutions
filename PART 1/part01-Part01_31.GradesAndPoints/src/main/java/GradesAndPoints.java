
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int i = Integer.valueOf(scan.nextLine());
        if (i>100){
            System.out.println("incredible!");
        }else if (i>=90){
            System.out.println("5");
        }else if (i>=80){
            System.out.println("4");
        }else if (i>=70){
            System.out.println("3");
        }else if (i>=60){
            System.out.println("2");
        }else if (i>=50){
            System.out.println("1");
        }else if (i>=0){
            System.out.println("failed");
        }else if (i<0){
            System.out.println("impossible!");
        }

    }
}
