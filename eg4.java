import java.util.*;
public class eg4 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter score:");
       int m1 = input.nextInt();
       int m2 = input.nextInt();
       int m3 = input.nextInt();
       int m4 = input.nextInt();
       int m5 = input.nextInt();
       int add = m1+m2+m3+m4+m5;
       int aver = add/5;
       if(aver>35){
        System.out.println("Additional class required");
       }else{
        System.out.println("You are good to go");
       }
        input.close();
}

}
