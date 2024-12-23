import java.util.*;
public class s {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in celsuis:");
        double celsuis = input.nextDouble();
        double fahrenheit = (celsuis * 9/5)+32;
        System.out.println(celsuis + "The degree celsius is equal to"+ fahrenheit);
        input.close();
    } 

}
