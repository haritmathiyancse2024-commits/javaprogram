import java.util.Scanner;

public class largest_three {
    static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.println("Enter first number:");
        int A =  in.nextInt();
        System.out.println("Enter second number:");
        int B = in.nextInt();
        System.out.println("Enter third number:");
        int C = in.nextInt();

        if(A>B && A>C){
            System.out.println("Largest number is:" + A);
        }
        else if(B>C && B>A){
            System.out.println("Largest number is:" +B);

        }
        else{
            System.out.println("Largest number is:" +C);
        }


    }
}
