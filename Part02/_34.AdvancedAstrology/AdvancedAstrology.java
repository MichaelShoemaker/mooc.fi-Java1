
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i = 0; i< number; i ++){
            System.out.print("*");
        }
        System.out.println("");
        
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i = 1; i <= size; i++){
            //This sets the number of spaces to the integer passed
            //to the function minus the number of stars
            printSpaces(size-i);
            printStars(i);
            //System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int stars = 1;
        int spaces = height-1;
        for(int i = 0; i < height; i++){
            printSpaces(spaces);
            printStars(stars);
            stars +=2;
            spaces--;
            //System.out.println("");
        }
        for(int t = 0; t < 2; t++){
            printSpaces(height-2);
            printStars(3);
            //System.out.println("");
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
