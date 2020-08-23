
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int fac = Integer.valueOf(scanner.nextLine());
        
        int ans = 1;
        
        if(fac == 0){
            System.out.println(ans);
        }
        
        if(fac > 0){
            for(int i =1; i <= fac; i++){
                ans = ans * i;
            }
            System.out.println(ans);
        }

    }
}
