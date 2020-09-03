
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        System.out.println("The numbers in range["+lowerLimit+","+upperLimit+"]");
        for(int num:numbers){
            if(num >= lowerLimit && num <= upperLimit){
                System.out.println(num);
            }
        }
    }
    
    
}
