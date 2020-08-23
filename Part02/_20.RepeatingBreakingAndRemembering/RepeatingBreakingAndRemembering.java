
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int nums = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers:");
        while(true){
            int key = Integer.valueOf(scanner.nextLine());
            if(key == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            sum = sum + key;
            nums++;
            if(key%2==0){
                even++;
            }
            if(key%2!=0){
                odd++;
            }
        }
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+nums);
        double dsum = Double.valueOf(sum);
        double dnums = Double.valueOf(nums);
        System.out.println("Average: "+(dsum/dnums));
        System.out.println("Even: "+ even);
        System.out.println("Odd: "+odd);
        
    }
}
