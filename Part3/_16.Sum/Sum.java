
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        
    }
    
    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        return sum;
    }

}
