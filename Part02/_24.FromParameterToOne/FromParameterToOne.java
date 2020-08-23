

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(2);

    }
    public static void printFromNumberToOne(int num){
        //int count = 1;
        while(num > 0){
            System.out.println(num);
            num--;
        }
    }
}
