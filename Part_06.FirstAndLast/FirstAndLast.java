
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        int last = 0;
        if(list.size()<=1){
            last = 0;
        }else{
            last = list.size() - 1;
        }
        
        
        //System.out.println(list.size());
        //System.out.println(last);
        System.out.println(list.get(0));
        System.out.println(list.get(last));

    }
}
