import java.util.Scanner;

public class lefttriangle {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of columns");
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            //print spaces(n-i)
            for(int j = 1;j <= n-i;j++){
                System.out.print("  ");
            }
            //print stars(i)
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
