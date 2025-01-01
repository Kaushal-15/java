import java.util.*;
public class eg {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int sub = input.nextInt();
        int[] marks = new int[sub];
        int sum =0;
        System.out.println("Enter the marks one by one:");
        for(int i=0;i<sub;i++){
            System.out.println("Subject"+(i+1)+":");
            marks[i]=input.nextInt();
            sum+=marks[i];
        }
        double average = sum / sub;
    System.out.println("\nThe total marks:"+sum);
    System.out.println("Average mark:"+average);

}

}
