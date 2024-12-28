import java.util.*;
public class else {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter score:");
       int score = input.nextInt();
       if(score<50){
        System.out.println("You need to Improve");
       }else if(score>=50 && score<=70){
        System.out.println("Good Job");
       }else{
        System.out.println("Excellent");
       }
        input.close();
}

}
