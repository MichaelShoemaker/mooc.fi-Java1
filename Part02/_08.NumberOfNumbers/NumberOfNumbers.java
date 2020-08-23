
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = 0;
        while(true){
            System.out.println("Give a number:");
            int inc = Integer.valueOf(scanner.nextLine());
            
            if(inc == 0){
                break;
            }
            nums = nums + 1;
        }
        System.out.println("Number of numbers: "+nums);

    }
}
