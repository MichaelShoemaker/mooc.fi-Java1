
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String [] split = input.split(" ");
            int len = split.length - 1;
            System.out.println(split[len]);
        }

    }
}
