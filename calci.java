import  java.util.*;
public class s {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      System.out.print("Enter the number1:");
     int n1 =input.nextInt();
       System.out.print("Enter the number2:");
     int n2 = input.nextInt();
     input.nextLine();
     input.nextLine();
     System.out.print("Choose the operand:");
     String operand = input.nextLine();
     if(operand.equals("add")){
        System.out.printf("The result is %d",n1+n2);
     }else if(operand.equals("sub")){
        System.out.printf("The result is %d",n1-n2);
     }else if(operand.equals("Multiply")){
        System.out.printf("The result is %d",n1*n2);
     }else if(operand.equals("div")){
        if(n2 == 0){
            System.out.print("Cannot divide by zero");
        }else{
            System.out.printf("The result is %d",n1/n2);
        }
     }else{
        System.out.printf("%s is not supported here.",operand);
     }
     input.close();
    } 

}
