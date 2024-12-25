import  java.util.*;
public class s {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name =  input.nextLine();
        System.out.printf("Hello %s .What is your age.",name);
        int age = input.nextInt();
        input.nextLine();
        /*the above nextline method is used because when the Nextint or any other method than nextline is used then
        /* the age is entered then the neter is stored in the buffer and the lastnextline is skipped 
        /*because of the enter buffer*/
        System.out.printf("%d is an excellent age to start programming,What language do you prefer.",age);
        String language = input.nextLine();
        System.out.printf("%s is a very good language to start on for a fresher",language);
        input.close();
        
    } 

}
