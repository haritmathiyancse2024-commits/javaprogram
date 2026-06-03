import java.util.Scanner;

public class AreaofRect {
    static void main() {
      //  int length = 5;
        //int width = 5;
        //int arae = length * width;
       // System.out.println(area);
       Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        int length = input.nextInt();
        System.out.println("Enter width of rectangle:");
        int width  = input.nextInt();
        int Area = length * width;
        System.out.println(Area);

    }
}
