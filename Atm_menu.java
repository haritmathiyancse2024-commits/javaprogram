import java.sql.SQLOutput;
import java.util.Scanner;

public class Atm_menu {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int balance = 10000;

        System.out.println("===ATM Menu===");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");
        System.out.println("4. Exit");
        int choice = in.nextInt();

        switch(choice){
            case 1:
                System.out.println("Your balance is :" +balance);
                break;
            case 2:
                System.out.println("Enter amount to deposit:");
                int deposit = in.nextInt();
                balance = balance + deposit;
                System.out.println("Your updated balance is :" +balance);
                break;
            case 3:
                System.out.println("Enter amount to withdraw:");
                int withdraw = in.nextInt();
                if(withdraw<=balance){
                    balance = balance - withdraw;
                    System.out.println("Your updated balance is :" +balance);

                }else{
                    System.out.println("Insufficient balance");
                }
                break;
            case 4:
                System.out.println("Thank you for using ATM");
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}
