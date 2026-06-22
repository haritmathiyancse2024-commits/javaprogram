import java.util.Scanner;

public class print1to100 {
    static void main(String[] args) {
       // for(int i=1;i<=100;i++) {
         //   System.out.println(i);
        //}
        //sum of N numbers
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int n = input.nextInt();
        int sum =0;
      for(int i =1; i<=n;i++){
          sum = sum + i;

        }
        System.out.println("sum = "+sum);
        }
    }