
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> intlist = new ArrayList<>();
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                break;
            }
            intlist.add(num);
        }
        double tot = 0;
        double sum = 0;
        for(int val: intlist){
            tot = tot + val;
            sum++;
        }
        if(tot==0){
            System.out.println("No values given.");
        }else{
            double avg = tot/sum;
            System.out.println("Average: "+avg);
        }
    }
}
