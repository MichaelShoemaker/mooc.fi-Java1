
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double nums = 0;
        while(true){
            
            System.out.println("Give a number:");
            double holder = Integer.valueOf(scanner.nextLine());
            
            if(holder == 0){
                break;
            }
            nums = nums + 1;
            sum = sum + holder;
        }
        double avg = sum/nums;
        System.out.println("Average of the numbers: " + avg);

    }
}
