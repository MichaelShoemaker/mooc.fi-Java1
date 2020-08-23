
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String mystr = scan.nextLine();
        
        System.out.println("Give an integer:");
        int myint = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double mydoub = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean mybool = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+mystr);
        System.out.println("You gave the integer "+myint);
        System.out.println("You gave the double "+mydoub);
        System.out.println("You gave the boolean "+mybool);
    }
}
