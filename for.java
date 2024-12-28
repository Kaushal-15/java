import java.util.*;
public class for {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the starting num:");
       int a = input.nextInt();
       System.out.println("Enter the ending num");
       int b = input.nextInt();
       for(int i=a;i<=b;i++){
        System.out.println(i);
       }
        input.close();
}

}
