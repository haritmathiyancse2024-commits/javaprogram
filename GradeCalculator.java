import java.util.Scanner;

public class GradeCalculator {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String name = in.nextLine();



        System.out.println("Enter subjectA name:");
        String subjectA = in.next();
        int A = in.nextInt();
        while(A < 0 || A > 100){
            System.out.println("Enter valid marks!!!!!!");
            A = in.nextInt();
        }

        System.out.println("Enter subjectB name:");
        String subjectB = in.next();
        int B = in.nextInt();
        while(B < 0 || B > 100){
            System.out.println("Enter valid marks!!!!!!");
            B = in.nextInt();
        }

        System.out.println("Enter subjectC name:");
        String subjectC = in.next();
        int C = in.nextInt();
        while(C < 0 || C > 100){
            System.out.println("Enter valid marks!!!!!!");
            C = in.nextInt();
        }


            System.out.println("Enter subjectD name:");
        String subjectD = in.next();
        int D = in.nextInt();
        while(D < 0 || D > 100){
            System.out.println("Enter valid marks!!!!!!");
            D = in.nextInt();
        }

                System.out.println("Enter subjectE name:");
                String subjectE = in.next();
        int E = in.nextInt();
        while(E < 0 || E > 100){
            System.out.println("Enter valid marks!!!!!!");
            E = in.nextInt();
        }




        System.out.println(name);

        int student_Grade = A+B+C+D+E;
        System.out.println(student_Grade);

        Double percentage = student_Grade/5.0;
        System.out.println(percentage);



    }
}
