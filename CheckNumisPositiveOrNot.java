import java.util.Scanner;

public class CheckNumisPositiveOrNot {
    static void main() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Enter the number:");
        if(num>0) {
            System.out.println("Num is positive");
        }
        else{
            System.out.println("Num is negative");
        }
    }
}
