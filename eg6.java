import java.util.*;
public class eg6 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the salary:");
       int salary = input.nextInt();
       System.out.println("Enter the age:");
        int age = input.nextInt();
      if (salary<=20000 || age>=25){
        System.out.println("Enter the loan amount:");
        int loan =input.nextInt();
          if(loan<=50000){
            System.out.println("You are eligible for the loan");
        }else{
            System.out.println("Maximum loan amount is 50000");
        }
      }else{
        System.out.println("You are not eligible");
      }
    
   
        input.close();
}

}
