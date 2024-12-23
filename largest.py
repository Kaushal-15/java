import java.util.*;
public class s {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number1:");
       int num1 = input.nextInt();
       System.out.println("Enter the second number2:");
       int num2 = input.nextInt();
       int largest = (num1 > num2 ) ? num1 : num2;
       System.out.println("Largest is" + largest);
       input.close();
    } 

}
