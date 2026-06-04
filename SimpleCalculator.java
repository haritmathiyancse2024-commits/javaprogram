import java.util.Scanner;

public class SimpleCalculator {

    static void main(String[] args) {


        Scanner input  = new Scanner(System.in);
        //TAKING FIRST NUMBER
        System.out.println("Enter first number: ");
        double num1 = input.nextDouble();

        //TAKING OPERATOR
        System.out.println("Enter operator (+,-,*,/): ");
        char operator = input.next().charAt(0);

        //TAKING SECOND NUMBER
        System.out.println("Enter second number: ");
        double num2  = input.nextDouble();

        double result;

        if(operator == '+'){
            result = num1 + num2;
            System.out.println(result);
        }
        else if(operator == '-'){
            result = num1 - num2;
            System.out.println(result);
        }
        else if(operator == '*'){
            result = num1 * num2;
            System.out.println(result);
        }
        else if(operator == '/'){
            if(num2 == 0){
                System.out.println("Cannot divide by zero!!");
            }
            else{
                result = num1/num2;
                System.out.println(result);
            }
        }
        else{
            System.out.println("Invalid Input!!");
        }
        input.close();
    }

}
