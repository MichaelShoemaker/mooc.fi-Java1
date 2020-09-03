
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int a = Integer.valueOf(scanner.nextLine());
            if(a==9999){
                break;
            }
            list.add(a);
        }
       
        
        int srch = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < srch){
                srch = list.get(i);

            }
        }
        System.out.println("Smallest number: " + srch);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)==srch){
                System.out.println("Found at index "+ i);
            }
        }
    }
}
