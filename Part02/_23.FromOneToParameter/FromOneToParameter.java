

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);

    }
    public static void printUntilNumber(int num){
        int count = 1;
        while(count <= num){
            System.out.println(count);
            count++;
        }
    }

}
