
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double val = Double.valueOf(scan.nextLine());
        double calc = 0;
        if(val<5000){
            System.out.println("No tax!");
        }else if(val >= 5000 && val<25000){
            System.out.println("Tax: "+(100+(val-5000)*.08));
        }else if(val >= 25000 && val < 55000){
            System.out.println("Tax: "+(1700+(val-25000)*.1));
        }else if(val >= 55000 && val < 200000){
            System.out.println("Tax: "+(4700+(val-55000)*.12));
        }else if(val >= 200000 && val < 1000000){
            System.out.println("Tax: "+(22100+(val-200000)*.15));
        }else if(val >= 1000000){
            System.out.println("Tax: "+(142100+(val-1000000)*.17));
        }
    }
}
