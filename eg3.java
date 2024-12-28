import java.util.*;
public class eg3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter number:");
       int number = input.nextInt();
       if(number % 3 == 0 && number % 5 == 0){
        System.out.println("Divisible by both the numbers.");
       }else{
        System.out.println("Cannot divide by both the numbers.");
       }
        input.close();
}

}
