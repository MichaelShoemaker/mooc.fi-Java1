
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int len = 0;
        String longest = "";
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String [] split = input.split(",");
            sum = sum + Integer.valueOf(split[1]);
            count++;
            if(split[0].length() > len){
                len = split[0].length();
                longest = split[0];
            }
        }
        System.out.println("Longest name: "+longest);
        System.out.println("Average of the birth year: "+(1.0*sum/count));

    }
}
