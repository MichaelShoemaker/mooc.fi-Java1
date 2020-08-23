
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tot = 0;
        while(true){
            System.out.println("Give a number:");
            int inc = Integer.valueOf(scanner.nextLine());
            
            if(inc == 0){
                break;
            }
            
            if(inc != 0){
                tot = tot + inc;
            }
            
        }
        System.out.println("Sum of the numbers: " + tot);
    }
}
