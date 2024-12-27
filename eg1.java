import java.util.*;

class Main {
    public static void main(String args[]) {
        int PASS, pass;
        String user, USER;

        Scanner input = new Scanner(System.in);

        USER = "Kaushal";
        pass = 12345;

        System.out.println("Enter the Username:");
        user = input.nextLine();

        System.out.println("Enter the PASSWORD:");
        PASS = input.nextInt();

        if (USER.equals(user) && PASS == pass) {
            System.out.println("Welcome to the login page!");
        } else {
            System.out.println("Invalid Credentials");
        }

        input.close();
    }
}