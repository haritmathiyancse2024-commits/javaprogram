import java.sql.SQLOutput;
import java.util.Scanner;

public class typecasting {
    static void main() {
        Scanner input = new Scanner(System.in);
// Type casting
     //   int num = (int) (55.56f);
     //   System.out.println(num);


        //automatic type promotion in expressions
    //    int a = 260;
     //   byte b = (byte) a;
   //     System.out.println(b);

     //
        //int a = 56;
      //  int b = 64;
        //int c = 34;
        //int d  = (a*b)/c;
     //   System.out.println(d);


    //EXAMPLE FOR THE TYPECASTING CONCEPT
        byte b = 42;
        char c = 'a';
        float f = 5.67f;
        short s = 1024;
        int i = 50000;
        double d = 0.1234;
        double result = (f*b) + (i/c) + (d*s);
        //float + int - double = double
        
        System.out.println((f*b) + " " + (i/c) + " " + (d*s));
        System.out.println(result);



    }
}
