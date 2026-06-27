import java.util.Scanner;
public class Task7 {
    static double addition (double firstnum, double secondnum) {
        return firstnum + secondnum;
    }
    static double subtraction (double firstnum, double secondnum) {
        return firstnum - secondnum;
    }
    static double multiplication (double firstnum, double secondnum) {
        return firstnum * secondnum;
    }
    static double division (double firstnum, double secondnum) {
        return firstnum / secondnum;
    }
    static void main() {
        double firstnum;
        double secondnum;
        char choice;
        Scanner input = new Scanner (System.in);

        System.out.print("Enter First number: ");
        firstnum = input.nextDouble();

        System.out.print("Enter Second Number: ");
        secondnum = input.nextDouble();

        System.out.println("Addition +");
        System.out.println("Subtraction -");
        System.out.println("Multiplication *");
        System.out.println("Division /");
        choice = input.next().charAt(0);

        switch (choice) {
            case '+':
                System.out.println(addition(firstnum, secondnum));
                break;
            case '-':
                System.out.println(subtraction(firstnum, secondnum));
                break;
            case '*':
                System.out.println(multiplication(firstnum, secondnum));
                break;
            case '/':
                System.out.println(division(firstnum, secondnum));
                if(secondnum == 0)
                    System.out.println("Error: Division by 0 ");
                input.close();
                break;
            default:
                System.out.println("test");
        }

    }
}
