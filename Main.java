import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];

        arr[0] = 10;
        arr[1] = 45;
        arr[2] = 105;
        arr[3] = 106;
        System.out.println(arr[2]);

        //input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int j : arr) {
            System.out.println(j + " ");

        }
    }
}
