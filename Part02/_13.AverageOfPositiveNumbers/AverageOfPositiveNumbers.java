
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tot = 0;
        int numsPos = 0;
        
        while(true){
            System.out.println();
            int grab = Integer.valueOf(scanner.nextLine());
            if(grab == 0){
                break;
            }
            
            if(grab > 0){
                numsPos = numsPos + 1;
                tot = tot + grab;
            }
        }
        if(numsPos < 1){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(tot/numsPos);
        }
    }
}
