import java.util.*;

public class s {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number1: ");
        int n1 = input.nextInt();

        System.out.print("Enter the number2: ");
        int n2 = input.nextInt();

        input.nextLine(); // Consume leftover newline character

        System.out.print("Choose the operand (sum, sub, mul, div): ");
        String operand = input.nextLine().toLowerCase(); 

        switch (operand) {
            case "sum":
                System.out.printf("The result is %d", n1 + n2);
                break;
            case "sub":
                System.out.printf("The result is %d", n1 - n2);
                break;
            case "mul":
                System.out.printf("The result is %d", n1 * n2);
                break;
            case "div":
                if (n2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.printf("The result is %d", n1 / n2);
                }
                break;
            default:
                System.out.println("Invalid operand. Please choose sum, sub, mul, or div.");
        }

        input.close();
    }
}
